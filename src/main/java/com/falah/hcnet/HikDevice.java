//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

public class HikDevice implements DeviceOptions {
    private final String ip;
    private final int port;
    private final String user;
    private final String password;
    private final HikDeviceTemplate deviceTemplate;
    private volatile Token token;
    private volatile Long setupAlarmHandle;

    public HikDevice(HCNetSDK hcnetsdk, String ip, int port, String user, String password) {
        this.deviceTemplate = new HikDeviceTemplate(hcnetsdk);
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    public HikResult<?> init() {
        if (this.token == null) {
            synchronized(this) {
                if (this.token == null) {
                    HikResult<Token> loginResult = this.deviceTemplate.login(this.ip, this.port, this.user, this.password);
                    if (loginResult.isSuccess()) {
                        this.token = (Token)loginResult.getData();
                    }

                    return loginResult;
                }
            }
        }

        return HikResult.ok();
    }

    public synchronized void destroy() {
        if (this.setupAlarmHandle != null) {
            this.deviceTemplate.getHcnetsdk().NET_DVR_CloseAlarmChan_V30(new NativeLong(this.setupAlarmHandle));
            this.setupAlarmHandle = null;
        }

        if (this.token != null && this.token.getUserId() != null) {
            this.deviceTemplate.logout(this.token.getUserId());
        }

    }

    public HikResult<?> doAction(BiFunction<HCNetSDK, Token, HikResult<?>> action) {
        this.checkInit();
        return (HikResult)action.apply(this.deviceTemplate.getHcnetsdk(), this.token);
    }

    public HikResult<Long> setupDeploy(HCNetSDK.FMSGCallBack messageCallback, HCNetSDK.FExceptionCallBack exceptionCallback) {
        this.checkInit();
        if (this.setupAlarmHandle != null) {
            throw new RuntimeException("重复布防.");
        } else {
            HikResult<Long> deployResult = this.deviceTemplate.setupDeploy(this.token.getUserId(), messageCallback, exceptionCallback);
            if (deployResult.isSuccess() && deployResult.getData() != null) {
                this.setupAlarmHandle = (Long)deployResult.getData();
            }

            return deployResult;
        }
    }

    public HikResult<PassThroughResponse> passThrough(String url, String data) {
        this.checkInit();
        return this.deviceTemplate.passThrough(this.token.getUserId(), url, data);
    }

    public HikResult<PassThroughResponse> passThrough(String url, String data, int exceptOutByteSize) {
        this.checkInit();
        return this.deviceTemplate.passThrough(this.token.getUserId(), url, data.getBytes(), exceptOutByteSize);
    }

    public <T extends Structure> HikResult<T> getDvrConfig(long channel, int command, Class<T> clazz) {
        this.checkInit();
        return this.deviceTemplate.getDvrConfig(this.token.getUserId(), channel, command, clazz);
    }

    public HikResult<?> setDvrConfig(long channel, int type, Structure settings) {
        this.checkInit();
        return this.deviceTemplate.setDvrConfig(this.token.getUserId(), channel, type, settings);
    }

    public HikResult<?> modifyPassword(String targetUser, String newPassword) {
        this.checkInit();
        return this.deviceTemplate.modifyPassword(this.token.getUserId(), targetUser, newPassword);
    }

    public MaintainOptions opsForMaintain() {
        this.checkInit();
        return this.deviceTemplate.opsForMaintain(this.token.getUserId());
    }

    public PtzOptions opsForPtz() {
        this.checkInit();
        return this.deviceTemplate.opsForPtz(this.token.getUserId());
    }

    private void checkInit() {
        HikResult<?> result = this.init();
        if (!result.isSuccess()) {
            throw new RuntimeException(result.getError());
        }
    }

    public String getIp() {
        return this.ip;
    }

    public int getPort() {
        return this.port;
    }

    public HikDeviceTemplate getDeviceTemplate() {
        return this.deviceTemplate;
    }

    public Token getToken() {
        return this.token;
    }
}
