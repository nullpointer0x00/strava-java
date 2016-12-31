package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by nullpointer0x00 on 12/30/16.
 */
public class HeartRate {

    @JsonProperty(value = "custom_zones")
    private Boolean customZones;
    @JsonProperty(value = "zones")
    private List<Zone> heartRateZones;

    public Boolean getCustomZones() {
        return customZones;
    }

    public void setCustomZones(Boolean customZones) {
        this.customZones = customZones;
    }

    public List<Zone> getHeartRateZones() {
        return heartRateZones;
    }

    public void setHeartRateZones(List<Zone> heartRateZones) {
        this.heartRateZones = heartRateZones;
    }
}
