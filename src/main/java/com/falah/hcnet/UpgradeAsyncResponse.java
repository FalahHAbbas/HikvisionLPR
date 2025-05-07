//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import java.io.Serializable;
import java.util.concurrent.Future;

public class UpgradeAsyncResponse implements Serializable {
    private long handle;
    private Future<UpgradeResponse> future;

    public long getHandle() {
        return this.handle;
    }

    public Future<UpgradeResponse> getFuture() {
        return this.future;
    }

    public void setHandle(long handle) {
        this.handle = handle;
    }

    public void setFuture(Future<UpgradeResponse> future) {
        this.future = future;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UpgradeAsyncResponse)) {
            return false;
        } else {
            UpgradeAsyncResponse other = (UpgradeAsyncResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getHandle() != other.getHandle()) {
                return false;
            } else {
                Object this$future = this.getFuture();
                Object other$future = other.getFuture();
                if (this$future == null) {
                    if (other$future != null) {
                        return false;
                    }
                } else if (!this$future.equals(other$future)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof UpgradeAsyncResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $handle = this.getHandle();
        result = result * 59 + (int)($handle >>> 32 ^ $handle);
        Object $future = this.getFuture();
        result = result * 59 + ($future == null ? 43 : $future.hashCode());
        return result;
    }

    public String toString() {
        return "UpgradeAsyncResponse(handle=" + this.getHandle() + ", future=" + this.getFuture() + ")";
    }
}
