package com.falah;

import com.github.lkqm.hcnet.HCNetSDK;
import com.github.lkqm.hcnet.HikDevice;
import com.github.lkqm.hcnet.HikResult;
import com.github.lkqm.hcnet.Token;
import com.sun.jna.NativeLong;

import java.util.Objects;
import java.util.Scanner;

public class HikvisionMain {


    public static void main(String[] args) {

        PrintingService printingService = new PrintingService();
        final RampService rampService = new RampService();
        try {
            HikDevice device = new HikDevice((HCNetSDK) NativeLibraryLoader.loadLibrary("libhcnetsdk"), "192.168.1.64", 8000, "admin", "Admin@123");
            var init = device.init();
            if (init.getData() instanceof Token token && Objects.equals(token.getDeviceSerialNumber(), "")) {
                throw new RuntimeException("Device not found");
            }
            System.out.println("Init result: " + init);
            HCNetSDK.FMSGCallBack messageCallback = (lCommand, pAlarmer, pAlarmInfo, dwBufLen, pUser) -> {
                System.out.println("An event triggered." + lCommand);
                // 1. Check the event type (lCommand)
//                if (lCommand.intValue() != 12368) return;
                PlatesGetter platesGetter = new PlatesGetter(plate -> {
                    System.out.println("plate = " + plate);//todo: save to db
                    plate.setPlateNumber("22F48431");
                    //check if has reservation
                    rampService.checkReservation(plate.getPlateNumber(), (result, error) -> {
                        if (error != null) {
                            System.out.println("error = " + error.getDetail());
                            if (error.getStatus() == 200) {
                                rampService.reserve(plate.getPlateNumber(), (result1, error1) -> {
                                    if (error1 == null) {
                                        System.out.println("error1 = " + error1.getDetail());
                                        rampService.enterBexy(result1, (result2, error2) -> {
                                            System.out.println("result2 = " + result2);
                                            System.out.println("result1 = " + result2);
                                            var url = RampService.baseUrl + "Reservations/QrCode/Truck/" + result1;
                                            printingService.initPrinter(url);

//                                        rampService.enterWaitingYard(result1, (result3, error3) -> {
//                                            System.out.println("result3 = " + result3);
//                                        });
                                        });
                                    } else {
                                        System.out.println("error = " + error1.getDetail());
                                    }
                                });
                            } else {
                                System.out.println("error = " + error.getDetail());
                            }
                        } else {
                            System.out.println("result = " + result);
                            rampService.enterBexy(result, (result1, error1) -> {
                                System.out.println("result1 = " + result);
                                var url = RampService.baseUrl + "Reservations/QrCode/Truck/" + result;
                                printingService.initPrinter(url);

                            });
                        }
                    });

                });

            };

            HCNetSDK.FExceptionCallBack exceptionCallback = (dwType, lUserID, lHandle, pUser) -> System.err.println("Exception occurred: " + dwType + ", User ID: " + lUserID + ", Handle: " + lHandle + ", User: " + pUser);

// Set up event handling using setupDeploy
            messageCallback.invoke(new NativeLong(0), null, null, 0, null);
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
