package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by nullpointer0x00 on 1/15/17.
 */
public class ActivityZones {

    private Integer score;
    @JsonProperty(value = "distribution_buckets")
    private List<Zone> distributionBuckets;
    private String type;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    @JsonProperty(value = "sensor_based")
    private Boolean sensorBased;
    private Integer points;
    @JsonProperty(value = "custom_zones")
    private Boolean customZones;
    private Integer max;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<Zone> getDistributionBuckets() {
        return distributionBuckets;
    }

    public void setDistributionBuckets(List<Zone> distributionBuckets) {
        this.distributionBuckets = distributionBuckets;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getResourceState() {
        return resourceState;
    }

    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    public Boolean getSensorBased() {
        return sensorBased;
    }

    public void setSensorBased(Boolean sensorBased) {
        this.sensorBased = sensorBased;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Boolean getCustomZones() {
        return customZones;
    }

    public void setCustomZones(Boolean customZones) {
        this.customZones = customZones;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
