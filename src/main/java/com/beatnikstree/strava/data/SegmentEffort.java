package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by nullpointer0x00 on 12/31/16.
 */
public class SegmentEffort implements Serializable {

    private Long id;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    private String name;
    private Activity activity;
    private Athlete athlete;
    private List<Achievements> achievements;
    private Segment segment;
    @JsonProperty(value = "elapsed_time")
    private Integer elapsedTime;
    @JsonProperty(value = "moving_time")
    private Integer movingTime;
    @JsonProperty(value = "start_date")
    private Date startDate;
    @JsonProperty(value = "start_date_local")
    private Date startDateLocal;
    private Double distance;
    @JsonProperty(value = "start_index")
    private Integer startIndex;
    @JsonProperty(value = "end_index")
    private Integer endIndex;
    @JsonProperty(value = "average_cadence")
    private Double averageCandence;
    @JsonProperty(value = "average_watts")
    private Double avarageWatts;
    @JsonProperty(value = "device_watts")
    private Boolean deviceWatts;
    @JsonProperty(value = "average_heartrate")
    private Double averageHeartRate;
    @JsonProperty(value = "max_heartrate")
    private Double maxHeartRate;
    @JsonProperty(value = "kom_rank")
    private Integer komRank;
    @JsonProperty(value = "pr_rank")
    private Integer prRank;

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

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public List<Achievements> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievements> achievements) {
        this.achievements = achievements;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getMovingTime() {
        return movingTime;
    }

    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public Double getAverageCandence() {
        return averageCandence;
    }

    public void setAverageCandence(Double averageCandence) {
        this.averageCandence = averageCandence;
    }

    public Double getAvarageWatts() {
        return avarageWatts;
    }

    public void setAvarageWatts(Double avarageWatts) {
        this.avarageWatts = avarageWatts;
    }

    public Boolean getDeviceWatts() {
        return deviceWatts;
    }

    public void setDeviceWatts(Boolean deviceWatts) {
        this.deviceWatts = deviceWatts;
    }

    public Double getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(Double averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
    }

    public Double getMaxHeartRate() {
        return maxHeartRate;
    }

    public void setMaxHeartRate(Double maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public Integer getKomRank() {
        return komRank;
    }

    public void setKomRank(Integer komRank) {
        this.komRank = komRank;
    }

    public Integer getPrRank() {
        return prRank;
    }

    public void setPrRank(Integer prRank) {
        this.prRank = prRank;
    }
}
