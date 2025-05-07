package com.falah;

public class Main {

    public static void main(String[] args) {

        String cameraIp = "192.168.0.64";
        String printerIp = "192.168.0.200";
        Hikvision hikvision = new Hikvision(cameraIp, printerIp);
        Thread thread = new Thread(hikvision);
        thread.start();

        String cameraIp2 = "192.168.0.65";
        String printerIp2 = "192.168.0.201";
        Hikvision hikvision2 = new Hikvision(cameraIp2, printerIp2);
        Thread thread2 = new Thread(hikvision2);
        thread2.start();


    }
}
