//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import java.io.Serializable;
import java.util.Map;

public class ResponseStatus implements Serializable {
    private String requestURL;
    private Integer statusCode;
    private String subStatusCode;
    private String statusString;

    public static ResponseStatus ofXml(String xml) {
        ResponseStatus instance = new ResponseStatus();
        Map<String, String> map = InnerUtils.xmlToFlatMap(xml, "ResponseStatus");
        instance.setRequestURL((String)map.get("requestURL"));
        instance.setStatusCode(Integer.valueOf((String)map.get("statusCode")));
        instance.setSubStatusCode((String)map.get("subStatusCode"));
        instance.setStatusString((String)map.get("statusString"));
        return instance;
    }

    public String getRequestURL() {
        return this.requestURL;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public String getSubStatusCode() {
        return this.subStatusCode;
    }

    public String getStatusString() {
        return this.statusString;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setSubStatusCode(String subStatusCode) {
        this.subStatusCode = subStatusCode;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResponseStatus)) {
            return false;
        } else {
            ResponseStatus other = (ResponseStatus)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$statusCode = this.getStatusCode();
                Object other$statusCode = other.getStatusCode();
                if (this$statusCode == null) {
                    if (other$statusCode != null) {
                        return false;
                    }
                } else if (!this$statusCode.equals(other$statusCode)) {
                    return false;
                }

                Object this$requestURL = this.getRequestURL();
                Object other$requestURL = other.getRequestURL();
                if (this$requestURL == null) {
                    if (other$requestURL != null) {
                        return false;
                    }
                } else if (!this$requestURL.equals(other$requestURL)) {
                    return false;
                }

                Object this$subStatusCode = this.getSubStatusCode();
                Object other$subStatusCode = other.getSubStatusCode();
                if (this$subStatusCode == null) {
                    if (other$subStatusCode != null) {
                        return false;
                    }
                } else if (!this$subStatusCode.equals(other$subStatusCode)) {
                    return false;
                }

                Object this$statusString = this.getStatusString();
                Object other$statusString = other.getStatusString();
                if (this$statusString == null) {
                    if (other$statusString != null) {
                        return false;
                    }
                } else if (!this$statusString.equals(other$statusString)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResponseStatus;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $statusCode = this.getStatusCode();
        result = result * 59 + ($statusCode == null ? 43 : $statusCode.hashCode());
        Object $requestURL = this.getRequestURL();
        result = result * 59 + ($requestURL == null ? 43 : $requestURL.hashCode());
        Object $subStatusCode = this.getSubStatusCode();
        result = result * 59 + ($subStatusCode == null ? 43 : $subStatusCode.hashCode());
        Object $statusString = this.getStatusString();
        result = result * 59 + ($statusString == null ? 43 : $statusString.hashCode());
        return result;
    }

    public String toString() {
        return "ResponseStatus(requestURL=" + this.getRequestURL() + ", statusCode=" + this.getStatusCode() + ", subStatusCode=" + this.getSubStatusCode() + ", statusString=" + this.getStatusString() + ")";
    }
}
