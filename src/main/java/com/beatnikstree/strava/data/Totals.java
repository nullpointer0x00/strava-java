package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by nullpointer0x00 on 12/30/16.
 */
public class Totals implements Serializable {

    private Integer count;
    private Float distance;
    @JsonProperty(value = "moving_time")
    private Integer movingTime;
    @JsonProperty(value = "elapsed_time")
    private Integer elapsedTime;
    @JsonProperty(value = "elevation_gain")
    private Float elevationGain;
    @JsonProperty(value = "achievement_count")
    private Integer achievementCount;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Integer getMovingTime() {
        return movingTime;
    }

    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Float getElevationGain() {
        return elevationGain;
    }

    public void setElevationGain(Float elevationGain) {
        this.elevationGain = elevationGain;
    }

    public Integer getAchievementCount() {
        return achievementCount;
    }

    public void setAchievementCount(Integer achievementCount) {
        this.achievementCount = achievementCount;
    }
}
