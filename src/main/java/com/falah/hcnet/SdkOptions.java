//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;



public interface SdkOptions {
    String getVersion();

    HikResult<HCNetSDK.NET_DVR_SDKSTATE> getState();

    HikResult<HCNetSDK.NET_DVR_SDKABL> getAbility();

    HikResult<?> setLogFile(int var1, String var2, boolean var3);

    HikResult<?> setTimeout(int var1, int var2, int var3);
}
