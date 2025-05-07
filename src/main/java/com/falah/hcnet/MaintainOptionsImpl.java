//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class MaintainOptionsImpl extends BaseOptions implements MaintainOptions {
    private final NativeLong userId;

    public MaintainOptionsImpl(HikDeviceTemplate deviceTemplate, long userId) {
        super(deviceTemplate);
        this.userId = new NativeLong(userId);
    }

    public boolean isOnline() {
        return this.getHcnetsdk().NET_DVR_RemoteControl(this.userId, 20005, (Pointer)null, 0);
    }

    public HikResult<?> reboot() {
        boolean rebootResult = this.getHcnetsdk().NET_DVR_RebootDVR(this.userId);
        return !rebootResult ? this.lastError() : HikResult.ok();
    }

    public HikResult<Date> getDeviceTime() {
        HCNetSDK.NET_DVR_TIME netDvrTime = new HCNetSDK.NET_DVR_TIME();
        HikResult<?> result = this.deviceTemplate.getDvrConfig(this.userId.longValue(), 0L, 118, netDvrTime);
        if (!result.isSuccess()) {
            return HikResult.fail(result.getErrorCode(), result.getErrorMsg());
        } else {
            netDvrTime.read();
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, netDvrTime.dwYear);
            calendar.set(2, netDvrTime.dwMonth - 1);
            calendar.set(5, netDvrTime.dwDay);
            calendar.set(11, netDvrTime.dwHour);
            calendar.set(12, netDvrTime.dwMinute);
            calendar.set(13, netDvrTime.dwSecond);
            return HikResult.ok(calendar.getTime());
        }
    }

    public HikResult<?> setDeviceTime(Date time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        HCNetSDK.NET_DVR_TIME netDvrTime = new HCNetSDK.NET_DVR_TIME();
        netDvrTime.dwYear = calendar.get(1);
        netDvrTime.dwMonth = calendar.get(2) + 1;
        netDvrTime.dwDay = calendar.get(5);
        netDvrTime.dwHour = calendar.get(11);
        netDvrTime.dwMinute = calendar.get(12);
        netDvrTime.dwSecond = calendar.get(13);
        return this.deviceTemplate.setDvrConfig(this.userId.longValue(), 0L, 119, netDvrTime);
    }

    public HikResult<UpgradeResponse> upgradeSyncForDVR(String sdkPath) {
        try {
            HikResult<UpgradeAsyncResponse> upgradeResult = this.upgradeAsyncForDVR(sdkPath);
            if (!upgradeResult.isSuccess()) {
                return HikResult.fail(upgradeResult.getErrorCode(), upgradeResult.getErrorMsg());
            } else {
                UpgradeAsyncResponse asyncResponse = (UpgradeAsyncResponse)upgradeResult.getData();
                UpgradeResponse response = (UpgradeResponse)asyncResponse.getFuture().get();
                return HikResult.ok(response);
            }
        } catch (Throwable $ex) {
            try {
                throw $ex;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public HikResult<UpgradeResponse> upgradeSyncForACS(String sdkPath, int deviceNo) {
        HCNetSDK.NET_DVR_UPGRADE_PARAM upgradeParam = new HCNetSDK.NET_DVR_UPGRADE_PARAM();
        upgradeParam.dwUpgradeType = 0;
        upgradeParam.sFilename = sdkPath;
        upgradeParam.pInbuffer = (new IntByReference(deviceNo)).getPointer();
        upgradeParam.dwBufferLen = 4;
        return this.upgradeSync(upgradeParam);
    }

    public HikResult<UpgradeResponse> upgradeSync(HCNetSDK.NET_DVR_UPGRADE_PARAM upgradeParam) {
        try {
            HikResult<UpgradeAsyncResponse> upgradeResult = this.upgradeAsync(upgradeParam);
            if (!upgradeResult.isSuccess()) {
                return HikResult.fail(upgradeResult.getErrorCode(), upgradeResult.getErrorMsg());
            } else {
                UpgradeAsyncResponse asyncResponse = (UpgradeAsyncResponse)upgradeResult.getData();
                UpgradeResponse response = (UpgradeResponse)asyncResponse.getFuture().get();
                return HikResult.ok(response);
            }
        } catch (Throwable $ex) {
            try {
                throw $ex;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public HikResult<UpgradeAsyncResponse> upgradeAsyncForDVR(String sdkPath) {
        HCNetSDK.NET_DVR_UPGRADE_PARAM upgradeParam = new HCNetSDK.NET_DVR_UPGRADE_PARAM();
        upgradeParam.dwUpgradeType = 0;
        upgradeParam.sFilename = sdkPath;
        return this.upgradeAsync(upgradeParam);
    }

    public HikResult<UpgradeAsyncResponse> upgradeAsyncForACS(String sdkPath, int deviceNo) {
        HCNetSDK.NET_DVR_UPGRADE_PARAM upgradeParam = new HCNetSDK.NET_DVR_UPGRADE_PARAM();
        upgradeParam.dwUpgradeType = 0;
        upgradeParam.sFilename = sdkPath;
        upgradeParam.pInbuffer = (new IntByReference(deviceNo)).getPointer();
        upgradeParam.dwBufferLen = 4;
        return this.upgradeAsync(upgradeParam);
    }

    public HikResult<UpgradeAsyncResponse> upgradeAsync(HCNetSDK.NET_DVR_UPGRADE_PARAM upgradeParam) {
        upgradeParam.write();
        final NativeLong upgradeHandle = this.getHcnetsdk().NET_DVR_Upgrade_V50(this.userId, upgradeParam);
        if (upgradeHandle.longValue() == -1L) {
            return this.lastError();
        } else {
            FutureTask<UpgradeResponse> future = new FutureTask(new Callable<UpgradeResponse>() {
                public UpgradeResponse call() throws Exception {
                    int errorTimes = 0;

                    int state;
                    do {
                        Thread.sleep(TimeUnit.SECONDS.toMillis(15L));
                        state = MaintainOptionsImpl.this.getHcnetsdk().NET_DVR_GetUpgradeState(upgradeHandle);
                        if (state == -1) {
                            ++errorTimes;
                        } else {
                            errorTimes = 0;
                        }
                    } while(state == 2 || state == -1 && errorTimes >= 3);

                    UpgradeResponse response = new UpgradeResponse();
                    response.setHandle(upgradeHandle.longValue());
                    response.setState(state);
                    if (state == -1) {
                        response.setError(MaintainOptionsImpl.this.lastError());
                    } else {
                        MaintainOptionsImpl.this.getHcnetsdk().NET_DVR_CloseUpgradeHandle(upgradeHandle);
                    }

                    return response;
                }
            });
            (new Thread(future)).start();
            UpgradeAsyncResponse response = new UpgradeAsyncResponse();
            response.setHandle(upgradeHandle.longValue());
            response.setFuture(future);
            return HikResult.ok(response);
        }
    }

    public HikResult<String> getConfig() {
        HCNetSDK.NET_DVR_STRING_POINTER out = new HCNetSDK.NET_DVR_STRING_POINTER();
        out.byString = new byte[10485760];
        out.write();
        IntByReference returnSize = new IntByReference();
        boolean result = this.getHcnetsdk().NET_DVR_GetConfigFile_V30(this.userId, out.getPointer(), out.byString.length, returnSize);
        if (!result) {
            return this.lastError();
        } else {
            out.read();
            return HikResult.ok();
        }
    }

    public HikResult<?> getConfigFile(String file) {
        boolean result = this.getHcnetsdk().NET_DVR_GetConfigFile(this.userId, file);
        return !result ? this.lastError() : HikResult.ok();
    }

    public HikResult<?> setConfig(String configContent) {
        boolean result = this.getHcnetsdk().NET_DVR_SetConfigFile_EX(this.userId, configContent, configContent.getBytes().length);
        if (!result) {
            this.lastError();
        }

        return HikResult.ok();
    }

    public HikResult<?> setConfigFile(String file) {
        boolean result = this.getHcnetsdk().NET_DVR_SetConfigFile(this.userId, file);
        return !result ? this.lastError() : HikResult.ok();
    }

    public HikResult<?> remoteControl(int command, Pointer inBuffer, int inBufferSize) {
        boolean result = this.getHcnetsdk().NET_DVR_RemoteControl(this.userId, command, inBuffer, inBufferSize);
        return !result ? this.lastError() : HikResult.ok();
    }
}
