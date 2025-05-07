//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.Structure;

public interface DeviceOptions {
    HikResult<?> init();

    void destroy();

    HikResult<?> doAction(BiFunction<HCNetSDK, Token, HikResult<?>> var1);

    HikResult<Long> setupDeploy(HCNetSDK.FMSGCallBack var1, HCNetSDK.FExceptionCallBack var2);

    HikResult<PassThroughResponse> passThrough(String var1, String var2);

    HikResult<PassThroughResponse> passThrough(String var1, String var2, int var3);

    <T extends Structure> HikResult<T> getDvrConfig(long var1, int var3, Class<T> var4);

    HikResult<?> setDvrConfig(long var1, int var3, Structure var4);

    HikResult<?> modifyPassword(String var1, String var2);

    MaintainOptions opsForMaintain();

    PtzOptions opsForPtz();
}
