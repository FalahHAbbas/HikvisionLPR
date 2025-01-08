package com.falah;

import com.falah.core.OnCompleteListener;
import com.falah.core.OnListCompleteListener;
import com.falah.models.Error;
import com.falah.models.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class RampService {

    public static String baseUrl = "https://progress-api-bexy.digital-logic-gen.com/api/";

    private OkHttpClient client = new OkHttpClient();
    private Gson gson = new Gson();

    public void getRamps(OnListCompleteListener<Ramp> listener) {
        Request request = new Request.Builder().url(baseUrl + "Identity/User/Zone/Ramps?ageSize=15").build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {

                var body = response.body().string();
                if (!response.isSuccessful()) {
                    var error = gson.fromJson(body, Error.class);
                    listener.onComplete(null, error);
                    return;
                }
                JSONObject jsonObject = null;
                try {
                    jsonObject = new JSONObject(body);
                    JSONArray list = jsonObject.getJSONArray("ramps");
                    List<Ramp> ramps = Arrays.stream(gson.fromJson(list.toString(), Ramp[].class)).collect(Collectors.toList());
                    listener.onComplete(ramps, null);
                } catch (JSONException e) {

                }
            }
        });
    }

    public void getRamp(int id, OnCompleteListener<RampDetails> listener) {
        Request request = new Request.Builder().url(baseUrl + "/Operations/Operations/active/" + id).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                listener.onComplete(null, new Error(e.getMessage()));
            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                String body = response.body().string();
                if (!response.isSuccessful()) {
                    var error = gson.fromJson(body, Error.class);
                    listener.onComplete(null, error);
                    return;
                }
                RampDetails ramp = gson.fromJson(body, RampDetails.class);
                listener.onComplete(ramp, null);
            }
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

        Request request = new Request.Builder().url(url).post(RequestBody.create("", null)).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                listener.onComplete(null, new Error(e.getMessage()));
            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                String body = response.body().string();
                if (!response.isSuccessful()) {
                    var error = gson.fromJson(body, Error.class);
                    listener.onComplete(null, error);
                    return;
                }
                RampDetails ramp = gson.fromJson(body, RampDetails.class);
                listener.onComplete(ramp, null);
            }
        });
    }

    public void checkReservation(String plateNumber, OnCompleteListener<String> listener) {
        var url = baseUrl + "Reservations/TruckTrips?PlateNumber=" + plateNumber;

        Request request = new Request.Builder().url(url).get().build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull okhttp3.Call call, @NotNull IOException e) {
                listener.onComplete(null, new Error(e.getMessage()));
            }

            @Override
            public void onResponse(@NotNull okhttp3.Call call, @NotNull okhttp3.Response response) throws IOException {
                String body = response.body().string();

                if (!response.isSuccessful()) {
                    var error = gson.fromJson(body, Error.class);
                    listener.onComplete(null, error);
                    return;
                }
//                Page page = gson.fromJson(body, Page.class);
                Type pageType = new TypeToken<Page<TruckTrip>>() {
                }.getType();
                Gson gson = new Gson();
                Page<TruckTrip> page = gson.fromJson(body, pageType);

                // Access the items and other properties of the Page object
                List<TruckTrip> items = page.getItems();


                if (page.getRowCount() > 0 && items.get(0).getStatus() == 0) {
                    listener.onComplete(items.get(0).getId(), null);
                } else {
                    var error = new Error();
                    if (page.getRowCount() > 0 && (items.get(0).getStatus() != 2 && items.get(0).getStatus() != 3)) {
                        error.setDetail("هذه الشاحنة لا تزال قيد المعالجة");
                        error.setStatus(400);
                    } else {
                        error.setDetail("This truck is not reserved");
                        error.setStatus(200);
                    }
                    listener.onComplete(null, error);

                }

            }
        });

    }

    public void reserve(String plateNumber, OnCompleteListener<String> listener) {
        var url = baseUrl + "Reservations/TruckTrips/Reserve";

        Request request = new Request.Builder().url(url).post(RequestBody.create("{\"plateNumber\":\"" + plateNumber + "\"}", MediaType.get("application/json"))).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull okhttp3.Call call, @NotNull IOException e) {
                listener.onComplete(null, new Error(e.getMessage()));
            }

            @Override
            public void onResponse(@NotNull okhttp3.Call call, @NotNull okhttp3.Response response) throws IOException {
                String body = response.body().string();
                if (!response.isSuccessful()) {
                    var error = gson.fromJson(body, Error.class);
                    listener.onComplete(null, error);
                    return;
                }
                Headers headers = response.headers();
                String contentDisposition = headers.get("Content-Disposition");
                String[] parts = contentDisposition.split("=");
                String fileName = parts[1];
                fileName = fileName.split("\\.")[0];
                listener.onComplete(fileName, null);
            }
        });

    }

    public void enterBexy(String tripId, OnCompleteListener<Boolean> listener) {
        var url = baseUrl + "Reservations/Gates/Enter-Bexy";

        var requestBody = "{" + "\"tripId\":\"" + tripId + "\"," + "\"vehicleType\": 0" + "}";

        Request request = new Request.Builder().url(url).put(RequestBody.create(requestBody, MediaType.get("application/json"))).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull okhttp3.Call call, @NotNull IOException e) {
                e.printStackTrace();
                listener.onComplete(null, new Error(e.getMessage()));
            }

            @Override
            public void onResponse(@NotNull okhttp3.Call call, @NotNull okhttp3.Response response) throws IOException {
                String body = response.body().string();
                if (!response.isSuccessful()) {
                    var error = gson.fromJson(body, Error.class);
                    listener.onComplete(null, error);
                }
                listener.onComplete(true, null);
            }
        });
    }

//    public void enterWaitingYard(String tripId, OnCompleteListener<Boolean> listener) {
//        var url = baseUrl + "Reservations/Gates/Enter-Waiting-Yard";
//        var requestBody = "{" +
//                          "\"tripId\":\"" + tripId + "\"," +
//                          "\"vehicleType\": 0" +
//                          "}";
//        Request request = new Request.Builder().url(url).
//                put(RequestBody.create(requestBody, MediaType.get("application/json"))).build();
//
//        client.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(@NotNull okhttp3.Call call, @NotNull IOException e) {
//                e.printStackTrace();
//                listener.onComplete(null, new Error(e.getMessage()));
//            }
//
//            @Override
//            public void onResponse(@NotNull okhttp3.Call call, @NotNull okhttp3.Response response) throws IOException {
//                String body = response.body().string();
//                if (!response.isSuccessful()) {
//                    var error = gson.fromJson(body, Error.class);
//                    listener.onComplete(null, error);
//                }
//                listener.onComplete(true, null);
//            }
//        });
//
//
//    }

}
