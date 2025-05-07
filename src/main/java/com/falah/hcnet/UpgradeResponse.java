//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import java.io.Serializable;

public class UpgradeResponse implements Serializable {
    private long handle;
    private int state;
    private HikResult<?> error;

    public boolean isUpgradeSuccess() {
        return this.state == 1;
    }

    public long getHandle() {
        return this.handle;
    }

    public int getState() {
        return this.state;
    }

    public HikResult<?> getError() {
        return this.error;
    }

    public void setHandle(long handle) {
        this.handle = handle;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setError(HikResult<?> error) {
        this.error = error;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UpgradeResponse)) {
            return false;
        } else {
            UpgradeResponse other = (UpgradeResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getHandle() != other.getHandle()) {
                return false;
            } else if (this.getState() != other.getState()) {
                return false;
            } else {
                Object this$error = this.getError();
                Object other$error = other.getError();
                if (this$error == null) {
                    if (other$error != null) {
                        return false;
                    }
                } else if (!this$error.equals(other$error)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof UpgradeResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $handle = this.getHandle();
        result = result * 59 + (int)($handle >>> 32 ^ $handle);
        result = result * 59 + this.getState();
        Object $error = this.getError();
        result = result * 59 + ($error == null ? 43 : $error.hashCode());
        return result;
    }

    public String toString() {
        return "UpgradeResponse(handle=" + this.getHandle() + ", state=" + this.getState() + ", error=" + this.getError() + ")";
    }
}
