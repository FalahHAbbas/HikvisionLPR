//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.NativeLong;

public class PtzOptionsImpl extends BaseOptions implements PtzOptions {
    private final NativeLong userId;

    public PtzOptionsImpl(HikDeviceTemplate deviceTemplate, long userId) {
        super(deviceTemplate);
        this.userId = new NativeLong(userId);
    }

    public HikResult<?> control(int command, int stop, int speed) {
        boolean result = this.getHcnetsdk().NET_DVR_PTZControlWithSpeed_Other(this.userId, new NativeLong(1L), command, stop, speed);
        return result ? HikResult.ok() : this.lastError();
    }

    public HikResult<?> controlStart(int command, int speed) {
        return this.control(command, 0, speed);
    }

    public HikResult<?> controlStop(int command, int speed) {
        return this.control(command, 0, speed);
    }

    public HikResult<?> presetSet(int presetIndex) {
        return this.preset(8, presetIndex);
    }

    public HikResult<?> presetClean(int presetIndex) {
        return this.preset(9, presetIndex);
    }

    public HikResult<?> presetGoto(int presetIndex) {
        return this.preset(39, presetIndex);
    }

    public HikResult<?> preset(int presetCommand, int presetIndex) {
        boolean result = this.getHcnetsdk().NET_DVR_PTZPreset_Other(this.userId, new NativeLong(1L), presetCommand, presetIndex);
        return result ? HikResult.ok() : this.lastError();
    }

    public HikResult<?> cruise(int cruiseCommand, int cruiseRoute, int cruisePoint, int speed) {
        boolean result = this.getHcnetsdk().NET_DVR_PTZCruise_Other(this.userId, new NativeLong(1L), cruiseCommand, (byte)cruiseRoute, (byte)cruisePoint, (short)((byte)speed));
        return result ? HikResult.ok() : this.lastError();
    }

    public HikResult<?> cruiseRun(int cruiseRoute) {
        return this.cruise(37, cruiseRoute, 0, 0);
    }

    public HikResult<?> cruiseStop(int cruiseRoute) {
        return this.cruise(38, cruiseRoute, 0, 0);
    }

    public HikResult<?> cruiseFillPreset(int cruiseRoute, int cruisePoint, int speed) {
        return this.cruise(30, cruiseRoute, cruisePoint, speed);
    }

    public HikResult<?> track(int trackCommand) {
        boolean result = this.getHcnetsdk().NET_DVR_PTZTrack_Other(this.userId, new NativeLong(1L), trackCommand);
        return result ? HikResult.ok() : this.lastError();
    }

    public HikResult<?> trackStartRecord() {
        return this.track(34);
    }

    public HikResult<?> trackStopRecord() {
        return this.track(35);
    }

    public HikResult<?> trackRun() {
        return this.track(35);
    }

    public HikResult<?> zoom(int xTop, int yTop, int xBottom, int yBottom) {
        HCNetSDK.NET_DVR_POINT_FRAME point = new HCNetSDK.NET_DVR_POINT_FRAME();
        point.xTop = xTop;
        point.yTop = yTop;
        point.xBottom = xBottom;
        point.yBottom = yBottom;
        point.write();
        boolean result = this.getHcnetsdk().NET_DVR_PTZSelZoomIn_EX(this.userId, new NativeLong(1L), point);
        return result ? HikResult.ok() : this.lastError();
    }
}
