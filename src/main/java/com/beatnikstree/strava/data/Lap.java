package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by nullpointer0x00 on 1/12/17.
 */
public class Lap implements Serializable {

    private Long id;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    @JsonProperty(value = "external_id")
    private String externalId;
    private String name;
    private Activity activity;
    private Athlete athlete;
    @JsonProperty(value = "average_cadence")
    private Float averageCadence;
    @JsonProperty(value = "average_speed")
    private Float averageSpeed;
    private Float distance;
    @JsonProperty(value = "elapsed_time")
    private Integer elapsedTime;
    @JsonProperty(value = "end_index")
    private Integer endIndex;
    @JsonProperty(value = "lap_index")
    private Integer lapIndex;
    @JsonProperty(value = "max_speed")
    private Float maxSpeed;
    @JsonProperty(value = "moving_time")
    private Integer movingTime;
    @JsonProperty(value = "pace_zone")
    private Integer paceZone;
    private Integer split;
    @JsonProperty(value = "start_date")
    private Date startDate;
    @JsonProperty(value = "start_date_local")
    private Date startDateLocal;
    @JsonProperty(value = "start_index")
    private Integer startIndex;
    @JsonProperty(value = "total_elevation_gain")
    private Float totalElevationGain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResourceState() {
        return resourceState;
    }

    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Float getAverageCadence() {
        return averageCadence;
    }

    public void setAverageCadence(Float averageCadence) {
        this.averageCadence = averageCadence;
    }

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

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public Integer getLapIndex() {
        return lapIndex;
    }

    public void setLapIndex(Integer lapIndex) {
        this.lapIndex = lapIndex;
    }

    public Float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getMovingTime() {
        return movingTime;
    }

    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    public Integer getPaceZone() {
        return paceZone;
    }

    public void setPaceZone(Integer paceZone) {
        this.paceZone = paceZone;
    }

    public Integer getSplit() {
        return split;
    }

    public void setSplit(Integer split) {
        this.split = split;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDateLocal() {
        return startDateLocal;
    }

    public void setStartDateLocal(Date startDateLocal) {
        this.startDateLocal = startDateLocal;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Float getTotalElevationGain() {
        return totalElevationGain;
    }

    public void setTotalElevationGain(Float totalElevationGain) {
        this.totalElevationGain = totalElevationGain;
    }
}
