package com.falah;

import com.github.lkqm.hcnet.HCNetSDK;
import com.github.lkqm.hcnet.HikDevice;
import com.github.lkqm.hcnet.HikResult;
import com.github.lkqm.hcnet.Token;

import java.util.Objects;
import java.util.Scanner;

public class HikvisionEventHandler {

    public static void main(String[] args) {
        try {
            // Load and initialize the Hikvision device
            HikDevice device = new HikDevice(NativeLibraryLoader.loadLibrary("libhcnetsdk"), "192.168.1.64", 8000, "admin", "Admin@123");
            var init = device.init();
            
            if (init.getData() instanceof Token token && Objects.equals(token.getDeviceSerialNumber(), "")) {
                throw new RuntimeException("Device not found");
            }
            
            System.out.println("Init result: " + init);

            // Set up the message callback to handle alarms
            HCNetSDK.FMSGCallBack messageCallback = (lCommand, pAlarmer, pAlarmInfo, dwBufLen, pUser) -> {
                System.out.println("An event triggered. Command: " + lCommand);

                // Check and handle specific alarm type
                if (pAlarmInfo != null) {
//                    var plateInfo = new HCNetSDK.NET_DVR_PLATE_INFO();
                    var plateInfo = new HCNetSDK.NET_DVR_PLATE_RESULT();
//                    var plateInfo = new HCNetSDK.COMM_UPLOAD_PLATE_RESULT();
//                    var plateInfo = new HCNetSDK.NET_ITC_PLATE_RECOG_PARAM();
//                    var plateInfo = new HCNetSDK.PLATE();
                    if (pAlarmInfo.getPointer().getByte(0) != 0) {
                        plateInfo.getPointer().write(0, pAlarmInfo.getPointer().getByteArray(0, plateInfo.size()), 0, plateInfo.size());
                        plateInfo.read();
                        
                        String licensePlate = (plateInfo.struPlateInfo.sLicense).trim();
                        System.out.println("Detected license plate: " + licensePlate);
                    }
                }
            };

            // Set up the exception callback
            HCNetSDK.FExceptionCallBack exceptionCallback = (dwType, lUserID, lHandle, pUser) ->
                    System.err.println("Exception occurred: " + dwType +
                                       ", User ID: " + lUserID +
                                       ", Handle: " + lHandle +
                                       ", User: " + pUser);

            // Deploy the event callback
            HikResult<Long> deployResult = device.setupDeploy(messageCallback, exceptionCallback);
            if (!deployResult.isSuccess()) {
                System.err.println("Failed to set up event handling: " + deployResult.getError());
                return;
            }

            System.out.println("Waiting for events...");
            new Scanner(System.in).nextLine();  // Keep running for demo; replace with CountDownLatch for production use.

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
