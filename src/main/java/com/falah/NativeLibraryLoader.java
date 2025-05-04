package com.falah;

import com.github.lkqm.hcnet.HCNetSDK;
import com.sun.jna.Native;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class NativeLibraryLoader {


    public static Object loadLibrary(String libraryName) {
        try {
            var os= System.getProperty("os.name").toLowerCase();

            InputStream in = NativeLibraryLoader.class.getResourceAsStream("/lib/" + libraryName + ".so"); // Adjust path if needed
            File tempFile = File.createTempFile(libraryName, ".so");
            tempFile.deleteOnExit();

            FileOutputStream out = new FileOutputStream(tempFile);
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            in.close();
            out.close();

//            System.load(tempFile.getAbsolutePath());
            if (os.contains("win")) {
                return Native.loadLibrary("C:\\lib\\HCNetSDK.dll", HCNetSDK.class);
            }
            return Native.loadLibrary(tempFile.getAbsolutePath(), HCNetSDK.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}