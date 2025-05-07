//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.Pointer;
import java.util.Date;

public interface MaintainOptions {
    boolean isOnline();

    HikResult<?> reboot();

    HikResult<Date> getDeviceTime();

    HikResult<?> setDeviceTime(Date var1);

    HikResult<UpgradeResponse> upgradeSync(HCNetSDK.NET_DVR_UPGRADE_PARAM var1);

    HikResult<UpgradeAsyncResponse> upgradeAsync(HCNetSDK.NET_DVR_UPGRADE_PARAM var1);

    HikResult<UpgradeResponse> upgradeSyncForDVR(String var1);

    HikResult<UpgradeAsyncResponse> upgradeAsyncForDVR(String var1);

    HikResult<UpgradeResponse> upgradeSyncForACS(String var1, int var2);

    HikResult<UpgradeAsyncResponse> upgradeAsyncForACS(String var1, int var2);

    HikResult<String> getConfig();

    HikResult<?> getConfigFile(String var1);

    HikResult<?> setConfig(String var1);

    HikResult<?> setConfigFile(String var1);

    HikResult<?> remoteControl(int var1, Pointer var2, int var3);
}
