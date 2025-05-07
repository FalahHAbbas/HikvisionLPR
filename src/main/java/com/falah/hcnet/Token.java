//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.NativeLong;
import java.io.Serializable;

public class Token implements Serializable {
    private final Long userId;
    private final String deviceSerialNumber;

    public NativeLong getUserIdNativeLong() {
        return new NativeLong(this.userId);
    }

    Token(Long userId, String deviceSerialNumber) {
        this.userId = userId;
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public static TokenBuilder builder() {
        return new TokenBuilder();
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Token)) {
            return false;
        } else {
            Token other = (Token)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$userId = this.getUserId();
                Object other$userId = other.getUserId();
                if (this$userId == null) {
                    if (other$userId != null) {
                        return false;
                    }
                } else if (!this$userId.equals(other$userId)) {
                    return false;
                }

                Object this$deviceSerialNumber = this.getDeviceSerialNumber();
                Object other$deviceSerialNumber = other.getDeviceSerialNumber();
                if (this$deviceSerialNumber == null) {
                    if (other$deviceSerialNumber != null) {
                        return false;
                    }
                } else if (!this$deviceSerialNumber.equals(other$deviceSerialNumber)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Token;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
        Object $deviceSerialNumber = this.getDeviceSerialNumber();
        result = result * 59 + ($deviceSerialNumber == null ? 43 : $deviceSerialNumber.hashCode());
        return result;
    }

    public String toString() {
        return "Token(userId=" + this.getUserId() + ", deviceSerialNumber=" + this.getDeviceSerialNumber() + ")";
    }

    public static class TokenBuilder {
        private Long userId;
        private String deviceSerialNumber;

        TokenBuilder() {
        }

        public TokenBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public TokenBuilder deviceSerialNumber(String deviceSerialNumber) {
            this.deviceSerialNumber = deviceSerialNumber;
            return this;
        }

        public Token build() {
            return new Token(this.userId, this.deviceSerialNumber);
        }

        public String toString() {
            return "Token.TokenBuilder(userId=" + this.userId + ", deviceSerialNumber=" + this.deviceSerialNumber + ")";
        }
    }
}
