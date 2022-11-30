package com.api.dbdistcalc.distance;

public class Distance {
    private String from;
    private String to;
    private Integer distance;
    private String unit;

    public Distance(String from, String to, Integer distance, String unit) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.unit = unit;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", distance=" + distance +
                ", unit='" + unit + '\'' +
                '}';
    }
}
