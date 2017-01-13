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
    private Float distance;
    @JsonProperty(value = "average_grade")
    private Float averageGrade;
    @JsonProperty(value = "maximum_grade")
    private Float maximumGrade;
    @JsonProperty(value = "elevation_high")
    private Float elevationHigh;
    @JsonProperty(value = "elevation_low")
    private Float elevationLow;
    @JsonProperty(value = "start_latitude")
    private Float endLatitude;
    @JsonProperty(value = "start_longitude")
    private Float endLongitude;
    @JsonProperty(value = "end_latitude")
    private Float startLatitude;
    @JsonProperty(value = "end_longitude")
    private Float startLongitude;
    @JsonProperty(value = "start_latlng")
    private Float[] startLatLng;
    @JsonProperty(value = "end_latlng")
    private Float[] endLatLng;
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

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Float getMaximumGrade() {
        return maximumGrade;
    }

    public void setMaximumGrade(Float maximumGrade) {
        this.maximumGrade = maximumGrade;
    }

    public Float getElevationHigh() {
        return elevationHigh;
    }

    public void setElevationHigh(Float elevationHigh) {
        this.elevationHigh = elevationHigh;
    }

    public Float getElevationLow() {
        return elevationLow;
    }

    public void setElevationLow(Float elevationLow) {
        this.elevationLow = elevationLow;
    }

    public Float getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Float endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Float getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Float endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Float getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Float startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Float getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Float startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Float[] getStartLatLng() {
        return startLatLng;
    }

    public void setStartLatLng(Float[] startLatLng) {
        this.startLatLng = startLatLng;
    }

    public Float[] getEndLatLng() {
        return endLatLng;
    }

    public void setEndLatLng(Float[] endLatLng) {
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
