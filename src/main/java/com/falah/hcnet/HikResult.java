//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

public class HikResult<T> {
    protected boolean success;
    protected Integer errorCode;
    protected String errorMsg;
    protected T data;

    public static <T> HikResult<T> ok() {
        return new HikResult<T>(true, (Integer)null, (String)null, (T)null);
    }

    public static <T> HikResult<T> ok(T data) {
        return new HikResult<T>(true, (Integer)null, (String)null, data);
    }

    public static <T> HikResult<T> fail(int code, String msg) {
        return new HikResult<T>(false, code, msg, (T)null);
    }

    public static <T> HikResult<T> fail(int code, String msg, T data) {
        return new HikResult<T>(false, code, msg, data);
    }

    public void set(HikResult data) {
        this.success = data.success;
        this.errorCode = data.errorCode;
        this.errorMsg = data.errorMsg;
    }

    public String getError() {
        return this.success ? "" : this.errorCode + "," + this.errorMsg;
    }

    public boolean isPasswordError() {
        return this.errorCode != null && this.errorCode == 1;
    }

    public boolean isDeviceOfflineError() {
        return this.errorCode != null && this.errorCode == 7;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public T getData() {
        return this.data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof HikResult)) {
            return false;
        } else {
            HikResult<?> other = (HikResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.isSuccess() != other.isSuccess()) {
                return false;
            } else {
                Object this$errorCode = this.getErrorCode();
                Object other$errorCode = other.getErrorCode();
                if (this$errorCode == null) {
                    if (other$errorCode != null) {
                        return false;
                    }
                } else if (!this$errorCode.equals(other$errorCode)) {
                    return false;
                }

                Object this$errorMsg = this.getErrorMsg();
                Object other$errorMsg = other.getErrorMsg();
                if (this$errorMsg == null) {
                    if (other$errorMsg != null) {
                        return false;
                    }
                } else if (!this$errorMsg.equals(other$errorMsg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof HikResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isSuccess() ? 79 : 97);
        Object $errorCode = this.getErrorCode();
        result = result * 59 + ($errorCode == null ? 43 : $errorCode.hashCode());
        Object $errorMsg = this.getErrorMsg();
        result = result * 59 + ($errorMsg == null ? 43 : $errorMsg.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "HikResult(success=" + this.isSuccess() + ", errorCode=" + this.getErrorCode() + ", errorMsg=" + this.getErrorMsg() + ", data=" + this.getData() + ")";
    }

    public HikResult(boolean success, Integer errorCode, String errorMsg, T data) {
        this.success = success;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public HikResult() {
    }
}
