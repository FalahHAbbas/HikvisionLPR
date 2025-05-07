package com.falah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;

public class PlatesGetter {
    private final OnPlateRecognizedListener listener;

    public PlatesGetter(OnPlateRecognizedListener listener) {
        this.listener = listener;
        System.setProperty("http.auth.digest.reEnabledAlgorithms", "MD5");
        try {
            String url = "http://" + Utils.IP + "/ISAPI/Traffic/channels/1/vehicleDetect/plates";
            String data = "<AfterTime><picTime>0</picTime></AfterTime>";

            // Set up digest authentication
            Authenticator.setDefault(new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("admin", "Admin@123".toCharArray());
                }
            });

            // Create connection
            URL urlObj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/xml"); // Assuming XML data
            con.setDoOutput(true);

            // Send data
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = data.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get response
            try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
//                System.out.println(response);
                var plate = HikvisionXMLParser.parseXML(response.toString());
                listener.onPlateRecognized(plate);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public interface OnPlateRecognizedListener {
        void onPlateRecognized(Plate plate);
    }
}