package com.example.coronoVirusTracker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


public class LocationStats {
    private String state;
    private  String country;
    private int latestTotalCase;

    public LocationStats(String state, String country, int latestTotalCase) {
        this.state = state;
        this.country = country;
        this.latestTotalCase = latestTotalCase;
    }

    public LocationStats() {

    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCase() {
        return latestTotalCase;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatestTotalCase(int latestTotalCase) {
        this.latestTotalCase = latestTotalCase;
    }
}
