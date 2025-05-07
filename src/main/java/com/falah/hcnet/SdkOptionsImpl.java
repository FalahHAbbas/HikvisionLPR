//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;


public class SdkOptionsImpl extends BaseOptions implements SdkOptions {
    public SdkOptionsImpl(HikDeviceTemplate deviceTemplate) {
        super(deviceTemplate);
    }

    public String getVersion() {
        int buildVersion = this.getHcnetsdk().NET_DVR_GetSDKBuildVersion();
        return (buildVersion >> 24) + "." + (buildVersion << 8 >> 24) + "." + (buildVersion << 16 >> 16);
    }

    public HikResult<HCNetSDK.NET_DVR_SDKSTATE> getState() {
        HCNetSDK.NET_DVR_SDKSTATE sdkState = new HCNetSDK.NET_DVR_SDKSTATE();
        boolean result = this.getHcnetsdk().NET_DVR_GetSDKState(sdkState);
        if (!result) {
            return this.lastError();
        } else {
            sdkState.read();
            return HikResult.ok(sdkState);
        }
    }

    public HikResult<HCNetSDK.NET_DVR_SDKABL> getAbility() {
        HCNetSDK.NET_DVR_SDKABL ability = new HCNetSDK.NET_DVR_SDKABL();
        boolean result = this.getHcnetsdk().NET_DVR_GetSDKAbility(ability);
        return !result ? this.lastError() : HikResult.ok(ability);
    }

    public HikResult<?> setLogFile(int logLevel, String logDir, boolean autoDel) {
        boolean result = this.getHcnetsdk().NET_DVR_SetLogToFile(logLevel, logDir, autoDel);
        return !result ? this.lastError() : HikResult.ok();
    }

    public HikResult<?> setTimeout(int connectTimeoutMs, int recvTimeoutMs, int reconnectIntervalMs) {
        boolean result = this.getHcnetsdk().NET_DVR_SetConnectTime(connectTimeoutMs, 3);
        if (!result) {
            return this.lastError();
        } else {
            result = this.getHcnetsdk().NET_DVR_SetRecvTimeOut(recvTimeoutMs);
            if (!result) {
                return this.lastError();
            } else {
                result = this.getHcnetsdk().NET_DVR_SetReconnect(reconnectIntervalMs, reconnectIntervalMs > 0);
                return !result ? this.lastError() : HikResult.ok();
            }
        }
    }
}
