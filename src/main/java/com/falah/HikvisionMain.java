package com.falah;

import com.github.lkqm.hcnet.HCNetSDK;
import com.github.lkqm.hcnet.HikDevice;
import com.github.lkqm.hcnet.HikResult;
import com.github.lkqm.hcnet.Token;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterJob;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class HikvisionMain {


    public static void main(String[] args) {
        final RampService rampService = new RampService();
        try {
            HikDevice device = new HikDevice(NativeLibraryLoader.loadLibrary("libhcnetsdk"), "192.168.1.64", 8000, "admin", "Admin@123");
            var init = device.init();
            if (init.getData() instanceof Token token && Objects.equals(token.getDeviceSerialNumber(), "")) {
                throw new RuntimeException("Device not found");
            }
            System.out.println("Init result: " + init);
            HCNetSDK.FMSGCallBack messageCallback = (lCommand, pAlarmer, pAlarmInfo, dwBufLen, pUser) -> {
                System.out.println("An event triggered." + lCommand);
                // 1. Check the event type (lCommand)
                PlatesGetter platesGetter = new PlatesGetter(plate -> {
                    System.out.println("plate = " + plate);//todo: save to db
                    plate.setPlateNumber("22F48431");
                    //check if has reservation
                    rampService.checkReservation(plate.getPlateNumber(), (result, error) -> {
                        if (error != null) {
                            System.out.println("error = " + error);
                            rampService.reserve(plate.getPlateNumber(), (result1, error1) -> {
                                if (error1 != null) {
                                    System.out.println("error1 = " + error1);
                                    rampService.enterBexy(result1, (result2, error2) -> {
                                        System.out.println("result2 = " + result2);
                                        rampService.enterWaitingYard(result1, (result3, error3) -> {
                                            System.out.println("result3 = " + result3);
                                        });
                                    });
                                } else {
                                    System.out.println("error = " + error1);
                                }
                            });
                        } else {
                            System.out.println("result = " + result);
                            rampService.enterBexy(result, (result1, error1) -> {
                                System.out.println("result1 = " + result1);
                                rampService.enterWaitingYard(result, (result2, error2) -> {
                                    System.out.println("result2 = " + result2);
                                    try {
                                        URL url = new URL(RampService.baseUrl + "Reservations/QrCode/Truck/" + result);
                                        BufferedImage image = ImageIO.read(url);

                                        // Print the image
                                        PrinterJob job = PrinterJob.getPrinterJob();
                                        job.setPrintable(new ImagePrintable(image));
                                        job.print();

//                                        if (job.printDialog()) {
//                                            job.print();
//                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                });
                            });
                        }
                    });

                });

            };

            HCNetSDK.FExceptionCallBack exceptionCallback = (dwType, lUserID, lHandle, pUser) -> System.err.println("Exception occurred: " + dwType + ", User ID: " + lUserID + ", Handle: " + lHandle + ", User: " + pUser);

// Set up event handling using setupDeploy
            HikResult<Long> deployResult = device.setupDeploy(messageCallback, exceptionCallback);
            if (!deployResult.isSuccess()) {
                System.err.println("Failed to set up event handling: " + deployResult.getError());
                return;
            }

//....
            System.out.println("Waiting for events...");
            // Keep the program running to listen for events.
            // In a real application, you'd have a loop or a way to keep the main thread alive.
            new Scanner(System.in).nextLine();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
