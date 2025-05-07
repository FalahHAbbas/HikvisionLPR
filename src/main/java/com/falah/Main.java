package com.falah;

public class Main {

    public static void main(String[] args) {

        String cameraIp = "192.168.0.64";
        String printerIp = "192.168.0.200";
        Hikvision hikvision = new Hikvision(cameraIp, printerIp);
        Thread thread = new Thread(hikvision);
        thread.start();



    }
}
