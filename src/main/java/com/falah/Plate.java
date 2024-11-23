package com.falah;

public class Plate {
    private String captureTime;
    private String plateNumber;
    private String picName;
    private String country;
    private int laneNo;
    private String direction;
    private String matchingResult;

    // Getters and Setters

    public String getCaptureTime() {
        return captureTime;
    }

    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(int laneNo) {
        this.laneNo = laneNo;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMatchingResult() {
        return matchingResult;
    }

    public void setMatchingResult(String matchingResult) {
        this.matchingResult = matchingResult;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "captureTime='" + captureTime + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", picName='" + picName + '\'' +
                ", country='" + country + '\'' +
                ", laneNo=" + laneNo +
                ", direction='" + direction + '\'' +
                ", matchingResult='" + matchingResult + '\'' +
                '}';
    }
}
