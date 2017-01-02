package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by nullpointer0x00 on 12/31/16.
 */
public class Segment implements Serializable {

    private Long id;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    private String name;
    @JsonProperty(value = "activity_type")
    private String activityType;
    private Double distance;
    @JsonProperty(value = "average_grade")
    private Double averageGrade;
    @JsonProperty(value = "maximum_grade")
    private Double maximumGrade;
    @JsonProperty(value = "elevation_high")
    private Double elevationHigh;
    @JsonProperty(value = "elevation_low")
    private Double elevationLow;
    @JsonProperty(value = "start_latitude")
    private Double endLatitude;
    @JsonProperty(value = "start_longitude")
    private Double endLongitude;
    @JsonProperty(value = "end_latitude")
    private Double startLatitude;
    @JsonProperty(value = "end_longitude")
    private Double startLongitude;
    @JsonProperty(value = "start_latlng")
    private Double[] startLatLng;
    @JsonProperty(value = "end_latlng")
    private Double[] endLatLng;
    private Boolean starred;
    private Boolean hazardous;
    @JsonProperty(value = "climb_category")
    private Integer climbCategory;
    private String city;
    private String state;
    private String country;
    @JsonProperty(value = "private")
    private Boolean isPrivate;

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

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Double getMaximumGrade() {
        return maximumGrade;
    }

    public void setMaximumGrade(Double maximumGrade) {
        this.maximumGrade = maximumGrade;
    }

    public Double getElevationHigh() {
        return elevationHigh;
    }

    public void setElevationHigh(Double elevationHigh) {
        this.elevationHigh = elevationHigh;
    }

    public Double getElevationLow() {
        return elevationLow;
    }

    public void setElevationLow(Double elevationLow) {
        this.elevationLow = elevationLow;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double[] getStartLatLng() {
        return startLatLng;
    }

    public void setStartLatLng(Double[] startLatLng) {
        this.startLatLng = startLatLng;
    }

    public Double[] getEndLatLng() {
        return endLatLng;
    }

    public void setEndLatLng(Double[] endLatLng) {
        this.endLatLng = endLatLng;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public Boolean getHazardous() {
        return hazardous;
    }

    public void setHazardous(Boolean hazardous) {
        this.hazardous = hazardous;
    }

    public Integer getClimbCategory() {
        return climbCategory;
    }

    public void setClimbCategory(Integer climbCategory) {
        this.climbCategory = climbCategory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }
}
