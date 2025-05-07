//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;


public abstract class BaseOptions {
    protected final HikDeviceTemplate deviceTemplate;

    public BaseOptions(HikDeviceTemplate deviceTemplate) {
        this.deviceTemplate = deviceTemplate;
    }

    protected HCNetSDK getHcnetsdk() {
        return this.deviceTemplate.getHcnetsdk();
    }

    protected <T> HikResult<T> lastError() {
        return this.deviceTemplate.lastError();
    }
}
