//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;


import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.NativeLongByReference;
import java.util.Objects;

public class HikDeviceTemplate implements DeviceTemplateOptions {
    public static final int DEFAULT_PORT = 8000;
    private final HCNetSDK hcnetsdk;

    public HikDeviceTemplate( HCNetSDK hcnetsdk) {
        if (hcnetsdk == null) {
            throw new NullPointerException("hcnetsdk is marked non-null but is null");
        } else {
            hcnetsdk.NET_DVR_Init();
            this.hcnetsdk = hcnetsdk;
        }
    }

    public HikResult<Token> login(String ip, int port, String user, String password) {
        HCNetSDK.NET_DVR_USER_LOGIN_INFO loginInfo = new HCNetSDK.NET_DVR_USER_LOGIN_INFO();
        System.arraycopy(ip.getBytes(), 0, loginInfo.sDeviceAddress, 0, ip.length());
        loginInfo.wPort = (short)port;
        System.arraycopy(user.getBytes(), 0, loginInfo.sUserName, 0, user.length());
        System.arraycopy(password.getBytes(), 0, loginInfo.sPassword, 0, password.length());
        loginInfo.bUseAsynLogin = 0;
        loginInfo.write();
        HCNetSDK.NET_DVR_DEVICEINFO_V40 deviceInfo = new HCNetSDK.NET_DVR_DEVICEINFO_V40();
        NativeLong userId = this.hcnetsdk.NET_DVR_Login_V40(loginInfo.getPointer(), deviceInfo.getPointer());
        deviceInfo.read();
        if (userId.longValue() == -1L) {
            return this.<Token>lastError();
        } else {
            Token token = Token.builder().userId(userId.longValue()).deviceSerialNumber((new String(deviceInfo.struDeviceV30.sSerialNumber)).trim()).build();
            return HikResult.ok(token);
        }
    }

    public HikResult<?> logout(long userId) {
        if (userId > -1L) {
            boolean result = this.hcnetsdk.NET_DVR_Logout(new NativeLong(userId));
            if (!result) {
                return this.lastError();
            }
        }

        return HikResult.ok();
    }

    @Override
    public HikResult<?> doAction(String ip, int port, String user, String password, com.falah.hcnet.BiFunction<HCNetSDK, Token, HikResult<?>> action) {
        HikResult<Token> loginResult = this.login(ip, port, user, password);
        if (!loginResult.isSuccess()) {
            return loginResult;
        } else {
            Token token = (Token)loginResult.getData();

            HikResult var9;
            try {
                HikResult<?> result = (HikResult)action.apply(this.hcnetsdk, token);
                if (result == null) {
                    result = HikResult.ok();
                }

                var9 = result;
            } finally {
                this.logout(token.getUserId());
            }

            return var9;
        }
    }

    public <T> HikResult<T> lastError() {
        int code = this.hcnetsdk.NET_DVR_GetLastError();
        if (code == 0) {
            return null;
        } else {
            String msg;
            if (code == 3) {
                msg = "sdk not init.";
            } else {
                msg = this.hcnetsdk.NET_DVR_GetErrorMsg(new NativeLongByReference(new NativeLong((long)code)));
            }

            return HikResult.fail(code, msg);
        }
    }

    public HikResult<PassThroughResponse> passThrough(long userId, String url, String input) {
        byte[] bytes = input == null ? null : input.getBytes();
        return this.passThrough(userId, url, bytes, 3145728);
    }

    public HikResult<PassThroughResponse> passThrough(long userId, String url, byte[] inputBytes, int exceptOutByteSize) {
        byte[] urlBytes = url.getBytes();
        inputBytes = inputBytes != null && inputBytes.length != 0 ? inputBytes : " ".getBytes();
        HCNetSDK.NET_DVR_STRING_POINTER urlPointer = new HCNetSDK.NET_DVR_STRING_POINTER();
        urlPointer.byString = urlBytes;
        urlPointer.write();
        HCNetSDK.NET_DVR_STRING_POINTER inputPointer = new HCNetSDK.NET_DVR_STRING_POINTER();
        inputPointer.byString = inputBytes;
        inputPointer.write();
        HCNetSDK.NET_DVR_XML_CONFIG_INPUT inputParams = new HCNetSDK.NET_DVR_XML_CONFIG_INPUT();
        inputParams.dwSize = inputParams.size();
        inputParams.lpRequestUrl = urlPointer.getPointer();
        inputParams.dwRequestUrlLen = urlPointer.byString.length;
        inputParams.lpInBuffer = inputPointer.getPointer();
        inputParams.dwInBufferSize = inputPointer.byString.length;
        inputParams.write();
        HCNetSDK.NET_DVR_STRING_POINTER outputPointer = new HCNetSDK.NET_DVR_STRING_POINTER();
        outputPointer.byString = new byte[exceptOutByteSize];
        HCNetSDK.NET_DVR_STRING_POINTER outputStatusPointer = new HCNetSDK.NET_DVR_STRING_POINTER();
        HCNetSDK.NET_DVR_XML_CONFIG_OUTPUT outputParams = new HCNetSDK.NET_DVR_XML_CONFIG_OUTPUT();
        outputParams.dwSize = outputParams.size();
        outputParams.lpOutBuffer = outputPointer.getPointer();
        outputParams.dwOutBufferSize = outputPointer.size();
        outputParams.lpStatusBuffer = outputStatusPointer.getPointer();
        outputParams.dwStatusSize = outputStatusPointer.size();
        inputPointer.write();
        boolean result = this.hcnetsdk.NET_DVR_STDXMLConfig(new NativeLong(userId), inputParams, outputParams);
        outputPointer.read();
        outputStatusPointer.read();
        byte[] data = outputPointer.byString;
        byte[] statusData = outputStatusPointer.byString;
        String statusXml = (new String(statusData)).trim();
        HikResult<PassThroughResponse> hikResult = new HikResult();
        PassThroughResponse response = new PassThroughResponse();
        if (!result) {
            HikResult<?> error = this.lastError();
            hikResult.set(error);
            if (statusXml.trim().length() > 0) {
                response.setStatus(ResponseStatus.ofXml(statusXml));
            }
        } else {
            hikResult.setSuccess(true);
            response.setBytes(data);
        }

        hikResult.setData(response);
        return hikResult;
    }

    public HikResult<Long> setupDeploy(long userId, HCNetSDK.FMSGCallBack messageCallback, HCNetSDK.FExceptionCallBack exceptionCallback) {
        if (messageCallback != null) {
            boolean result = this.hcnetsdk.NET_DVR_SetDVRMessageCallBack_V30(messageCallback, (Pointer)null);
            if (!result) {
                return this.<Long>lastError();
            }
        }

        NativeLong setupAlarmHandle = this.hcnetsdk.NET_DVR_SetupAlarmChan_V30(new NativeLong(userId));
        if (setupAlarmHandle.longValue() == -1L) {
            return this.<Long>lastError();
        } else {
            if (exceptionCallback != null) {
                boolean setExceptionResult = this.hcnetsdk.NET_DVR_SetExceptionCallBack_V30(0, setupAlarmHandle.intValue(), exceptionCallback, (Pointer)null);
                if (!setExceptionResult) {
                    this.hcnetsdk.NET_DVR_CloseAlarmChan_V30(setupAlarmHandle);
                    return this.<Long>lastError();
                }
            }

            return HikResult.ok(setupAlarmHandle.longValue());
        }
    }

    public HikResult<?> modifyPassword(long userId, String username, String newPassword) {
        HCNetSDK.NET_DVR_USER_V30 dvrUser = new HCNetSDK.NET_DVR_USER_V30();
        boolean getResult = this.hcnetsdk.NET_DVR_GetDVRConfig(new NativeLong(userId), 1006, new NativeLong(0L), dvrUser.getPointer(), dvrUser.size(), new IntByReference(0));
        if (!getResult) {
            HikResult<?> errorResult = this.lastError();
            errorResult.setSuccess(false);
            return errorResult;
        } else {
            dvrUser.read();

            for(HCNetSDK.NET_DVR_USER_INFO_V30 userInfo : dvrUser.struUser) {
                String name = (new String(userInfo.sUserName)).trim();
                if (Objects.equals(username, name)) {
                    userInfo.sPassword = newPassword.getBytes();
                }
            }

            dvrUser.write();
            boolean setResult = this.hcnetsdk.NET_DVR_SetDVRConfig(new NativeLong(userId), 1007, new NativeLong(0L), dvrUser.getPointer(), dvrUser.dwSize);
            if (!setResult) {
                HikResult<?> errorResult = this.lastError();
                errorResult.setSuccess(false);
                return errorResult;
            } else {
                return HikResult.ok();
            }
        }
    }

    public HikResult<?> nvrRebindChannels(long userId, String dvrUsername, String dvrNewPassword) {
        IntByReference ibrBytesReturned = new IntByReference(0);
        HCNetSDK.NET_DVR_IPPARACFG mStrIpparaCfg = new HCNetSDK.NET_DVR_IPPARACFG();
        mStrIpparaCfg.write();
        Pointer lpIpParaConfig = mStrIpparaCfg.getPointer();
        boolean getResult = this.hcnetsdk.NET_DVR_GetDVRConfig(new NativeLong(userId), 1048, new NativeLong(33L), lpIpParaConfig, mStrIpparaCfg.size(), ibrBytesReturned);
        if (!getResult) {
            HikResult<?> errorResult = this.lastError();
            errorResult.setSuccess(false);
            return errorResult;
        } else {
            mStrIpparaCfg.read();

            for(HCNetSDK.NET_DVR_IPDEVINFO deviceInfo : mStrIpparaCfg.struIPDevInfo) {
                String user = (new String(deviceInfo.sUserName)).trim();
                if (Objects.equals(dvrUsername, user)) {
                    deviceInfo.sPassword = dvrNewPassword.getBytes();
                    String var14 = (new String(deviceInfo.struIP.sIpV4)).trim();
                }
            }

            mStrIpparaCfg.write();
            boolean setResult = this.hcnetsdk.NET_DVR_SetDVRConfig(new NativeLong(userId), 1049, new NativeLong(33L), mStrIpparaCfg.getPointer(), mStrIpparaCfg.dwSize);
            if (!setResult) {
                HikResult<?> errorResult = this.lastError();
                errorResult.setSuccess(false);
                return errorResult;
            } else {
                return HikResult.ok();
            }
        }
    }

    public <T extends Structure> HikResult<T> getDvrConfig(long userId, long channel, int command, Class<T> clazz) {
        try {
            T data = (T)(clazz.newInstance());
            data.write();
            boolean result = this.hcnetsdk.NET_DVR_GetDVRConfig(new NativeLong(userId), command, new NativeLong(channel), data.getPointer(), data.size(), new IntByReference(0));
            if (!result) {
                return this.<T>lastError();
            } else {
                data.read();
                return HikResult.ok(data);
            }
        } catch (Throwable $ex) {
            try {
                throw $ex;
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public HikResult<?> getDvrConfig(long userId, long channel, int command, Structure data) {
        data.write();
        boolean result = this.hcnetsdk.NET_DVR_GetDVRConfig(new NativeLong(userId), command, new NativeLong(channel), data.getPointer(), data.size(), new IntByReference(0));
        if (!result) {
            return this.lastError();
        } else {
            data.read();
            return HikResult.ok();
        }
    }

    public HikResult<?> setDvrConfig(long userId, long channel, int command, Structure data) {
        data.write();
        boolean result = this.hcnetsdk.NET_DVR_SetDVRConfig(new NativeLong(userId), command, new NativeLong(channel), data.getPointer(), data.size());
        return !result ? this.lastError() : HikResult.ok();
    }

    public HikResult<Long> realPlay(long userId, HCNetSDK.FRealDataCallBack_V30 callback) {
        HCNetSDK.NET_DVR_PREVIEWINFO previewInfo = new HCNetSDK.NET_DVR_PREVIEWINFO();
        previewInfo.lChannel = new NativeLong(1L);
        previewInfo.dwStreamType = 0;
        previewInfo.dwLinkMode = 1;
        previewInfo.bBlocked = false;
        previewInfo.bPassbackRecord = false;
        previewInfo.byPreviewMode = 0;
        return this.realPlay(userId, previewInfo, callback);
    }

    public HikResult<Long> realPlay(long userId, HCNetSDK.NET_DVR_PREVIEWINFO previewInfo, HCNetSDK.FRealDataCallBack_V30 callback) {
        NativeLong realPlayHandle = this.hcnetsdk.NET_DVR_RealPlay_V40(new NativeLong(userId), previewInfo, callback, (Pointer)null);
        return realPlayHandle.longValue() == -1L ? this.lastError() : HikResult.ok(realPlayHandle.longValue());
    }

    public HikResult<?> stopRealPlay(long realHandle) {
        boolean result = this.hcnetsdk.NET_DVR_StopRealPlay(new NativeLong(realHandle));
        return result ? HikResult.ok() : this.lastError();
    }

    public SdkOptions opsForSdk() {
        return new SdkOptionsImpl(this);
    }

    public MaintainOptions opsForMaintain(long userId) {
        return new MaintainOptionsImpl(this, userId);
    }

    public PtzOptions opsForPtz(long userId) {
        return new PtzOptionsImpl(this, userId);
    }

    public HCNetSDK getHcnetsdk() {
        return this.hcnetsdk;
    }
}
