//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import java.io.Serializable;
import java.util.Arrays;

public class PassThroughResponse implements Serializable {
    private byte[] bytes;
    private ResponseStatus status;

    public String getStringData() {
        return this.bytes != null ? (new String(this.bytes)).trim() : null;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public ResponseStatus getStatus() {
        return this.status;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PassThroughResponse)) {
            return false;
        } else {
            PassThroughResponse other = (PassThroughResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (!Arrays.equals(this.getBytes(), other.getBytes())) {
                return false;
            } else {
                Object this$status = this.getStatus();
                Object other$status = other.getStatus();
                if (this$status == null) {
                    if (other$status != null) {
                        return false;
                    }
                } else if (!this$status.equals(other$status)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PassThroughResponse;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + Arrays.hashCode(this.getBytes());
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "PassThroughResponse(bytes=" + Arrays.toString(this.getBytes()) + ", status=" + this.getStatus() + ")";
    }
}
