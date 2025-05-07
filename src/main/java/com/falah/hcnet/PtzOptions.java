//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;


public interface PtzOptions {
    HikResult<?> control(int var1, int var2, int var3);

    HikResult<?> controlStart(int var1, int var2);

    HikResult<?> controlStop(int var1, int var2);

    HikResult<?> preset(int var1, int var2);

    HikResult<?> presetSet(int var1);

    HikResult<?> presetClean(int var1);

    HikResult<?> presetGoto(int var1);

    HikResult<?> cruise(int var1, int var2, int var3, int var4);

    HikResult<?> cruiseRun(int var1);

    HikResult<?> cruiseStop(int var1);

    HikResult<?> cruiseFillPreset(int var1, int var2, int var3);

    HikResult<?> track(int var1);

    HikResult<?> trackStartRecord();

    HikResult<?> trackStopRecord();

    HikResult<?> trackRun();

    HikResult<?> zoom(int var1, int var2, int var3, int var4);
}
