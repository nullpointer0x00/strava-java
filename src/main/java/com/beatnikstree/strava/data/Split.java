package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by nullpointer0x00 on 1/12/17.
 */
public class Split implements Serializable {

    @JsonProperty(value = "average_speed")
    private Float averageSpeed;
    private Float distance;
    @JsonProperty(value = "elapsed_time")
    private Integer elapsedTime;
    @JsonProperty(value = "elevation_difference")
    private Integer elevationDifference;
    @JsonProperty(value = "pace_zone")
    private Integer paceZone;
    @JsonProperty(value = "moving_time")
    private Integer movingTime;
    private Integer split;

    public Float getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Float averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getElevationDifference() {
        return elevationDifference;
    }

    public void setElevationDifference(Integer elevationDifference) {
        this.elevationDifference = elevationDifference;
    }

    public Integer getPaceZone() {
        return paceZone;
    }

    public void setPaceZone(Integer paceZone) {
        this.paceZone = paceZone;
    }

    public Integer getMovingTime() {
        return movingTime;
    }

    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    public Integer getSplit() {
        return split;
    }

    public void setSplit(Integer split) {
        this.split = split;
    }
}
