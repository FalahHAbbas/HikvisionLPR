package com.falah;

import com.falah.core.OnCompleteListener;
import com.falah.core.OnListCompleteListener;
import com.falah.models.Error;
import com.falah.models.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class RampService {

    public static String baseUrl = "https://api-bexy.digital-logic-gen.com/api/";

    private Gson gson = new Gson();
    private final Executor executor = Executors.newSingleThreadExecutor();

    private void sendRequest(String url, String method, String requestBody, OnCompleteListener<String> listener) {
        executor.execute(() -> {
            try {
                URL urlObj = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
                connection.setRequestMethod(method);
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");

                if (requestBody != null) {
                    connection.setDoOutput(true);
                    try (OutputStream os = connection.getOutputStream()) {
                        byte[] input = requestBody.getBytes(StandardCharsets.UTF_8);
                        os.write(input, 0, input.length);
                    }
                }

                int responseCode = connection.getResponseCode();

                if (responseCode >= 200 && responseCode < 300) {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                        StringBuilder response = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            response.append(line);
                        }
                        if (listener != null) {
                            if (responseCode == 204) {
                                listener.onComplete(null, null);
                            } else {
                                if (method.equals("POST") && url.contains("Reservations/TruckTrips/Reserve")) {
                                    String contentDisposition = connection.getHeaderField("Content-Disposition");
                                    String[] parts = contentDisposition.split("=");
                                    String fileName = parts[1];
                                    fileName = fileName.split("\\.")[0];
                                    listener.onComplete(fileName, null);
                                } else {
                                    listener.onComplete(response.toString(), null);
                                }
                            }

                        }
                    }
                } else {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), StandardCharsets.UTF_8))) {
                        StringBuilder response = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            response.append(line);
                        }
                        if (listener != null) {
                            listener.onComplete(null, gson.fromJson(response.toString(), Error.class));
                        }
                    }
                }
                connection.disconnect();
            } catch (IOException e) {
                if (listener != null) {
                    listener.onComplete(null, new Error(e.getMessage()));
                }
            }
        });
    }

    public void getRamps(OnListCompleteListener<Ramp> listener) {
        sendRequest(baseUrl + "Identity/User/Zone/Ramps?ageSize=15", "GET", null, (response, error) -> {
            if (error != null) {
                listener.onComplete(null, error);
                return;
            }
            try {
                JSONObject jsonObject = new JSONObject(response);
                JSONArray list = jsonObject.getJSONArray("ramps");
                List<Ramp> ramps = Arrays.stream(gson.fromJson(list.toString(), Ramp[].class)).collect(Collectors.toList());
                listener.onComplete(ramps, null);
            } catch (JSONException e) {
                listener.onComplete(null, new Error(e.getMessage()));
            }
        });
    }

    public void getRamp(int id, OnCompleteListener<RampDetails> listener) {
        sendRequest(baseUrl + "/Operations/Operations/active/" + id, "GET", null, (response, error) -> {
            if (error != null) {
                listener.onComplete(null, error);
                return;
            }
            RampDetails ramp = gson.fromJson(response, RampDetails.class);
            listener.onComplete(ramp, null);
        });
    }

    public void doRampAction(int id, RampDetails.ACTION action, UUID oprationsId, int cargoId, boolean callAnotherPickupTrip, OnCompleteListener<RampDetails> listener) {
        String url = switch (action) {
            case READY -> baseUrl + "Core/Ramps/" + id + "/Ready";
            case CHECKING -> baseUrl + "Operations/Operations/" + oprationsId + "/checking";
            case START_UNLOADING -> baseUrl + "Operations/Operations/" + oprationsId + "/starting";
            case FINISH_PICKUP ->
                    baseUrl + "Operations/Operations/" + oprationsId + "/finish-pickup?cargoTypeId=" + cargoId + "&callAnotherPickupTrip=" + callAnotherPickupTrip;
            case FINISH -> baseUrl + "Operations/Operations/" + oprationsId + "/finishing";
            case STOP -> baseUrl + "Operations/Operations/" + oprationsId + "/stop";
        };

        sendRequest(url, "POST", "", (response, error) -> {
            if (error != null) {
                listener.onComplete(null, error);
                return;
            }
            RampDetails ramp = gson.fromJson(response, RampDetails.class);
            listener.onComplete(ramp, null);
        });
    }

    public void checkReservation(String plateNumber, OnCompleteListener<String> listener) {
        sendRequest(baseUrl + "Reservations/TruckTrips?PlateNumber=" + plateNumber, "GET", null, (response, error) -> {
            if (error != null) {
                listener.onComplete(null, error);
                return;
            }
            Type pageType = new TypeToken<Page<TruckTrip>>() {
            }.getType();
            Page<TruckTrip> page = gson.fromJson(response, pageType);

            List<TruckTrip> items = page.getItems();

            if (page.getRowCount() > 0 && items.get(0).getStatus() == 0) {
                listener.onComplete(items.get(0).getId(), null);
            } else {
                var err = new Error();
                if (page.getRowCount() > 0 && (items.get(0).getStatus() != 2 && items.get(0).getStatus() != 3)) {
                    err.setDetail("هذه الشاحنة لا تزال قيد المعالجة");
                    err.setStatus(400);
                } else {
                    err.setDetail("This truck is not reserved");
                    err.setStatus(200);
                }
                listener.onComplete(null, err);
            }
        });
    }

    public void reserve(String plateNumber, OnCompleteListener<String> listener) {
        String requestBody = "{\"plateNumber\":\"" + plateNumber + "\"}";
        sendRequest(baseUrl + "Reservations/TruckTrips/Reserve", "POST", requestBody, listener);
    }

    public void enterBexy(String tripId, OnCompleteListener<Boolean> listener) {
        String requestBody = "{" + "\"tripId\":\"" + tripId + "\"," + "\"vehicleType\": 0 + \"}";
        sendRequest(baseUrl + "Reservations/Gates/Enter-Bexy", "PUT", requestBody, (response, error) -> {
            if (error != null) {
                listener.onComplete(null, error);
                return;
            }
            listener.onComplete(true, null);
        });
    }
}