//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.Structure;

public interface DeviceTemplateOptions {
    HikResult<Token> login(String var1, int var2, String var3, String var4);

    HikResult<?> logout(long var1);

    HikResult<?> doAction(String var1, int var2, String var3, String var4, BiFunction<HCNetSDK, Token, HikResult<?>> var5);

    <T> HikResult<T> lastError();

    HikResult<PassThroughResponse> passThrough(long var1, String var3, String var4);

    HikResult<PassThroughResponse> passThrough(long var1, String var3, byte[] var4, int var5);

    HikResult<Long> setupDeploy(long var1, HCNetSDK.FMSGCallBack var3, HCNetSDK.FExceptionCallBack var4);

    HikResult<?> modifyPassword(long var1, String var3, String var4);

    HikResult<?> nvrRebindChannels(long var1, String var3, String var4);

    <T extends Structure> HikResult<T> getDvrConfig(long var1, long var3, int var5, Class<T> var6);

    HikResult<?> getDvrConfig(long var1, long var3, int var5, Structure var6);

    HikResult<?> setDvrConfig(long var1, long var3, int var5, Structure var6);

    HikResult<Long> realPlay(long var1, HCNetSDK.FRealDataCallBack_V30 var3);

    HikResult<Long> realPlay(long var1, HCNetSDK.NET_DVR_PREVIEWINFO var3, HCNetSDK.FRealDataCallBack_V30 var4);

    HikResult<?> stopRealPlay(long var1);

    SdkOptions opsForSdk();

    MaintainOptions opsForMaintain(long var1);

    PtzOptions opsForPtz(long var1);
}
