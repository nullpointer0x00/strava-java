package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

/**
 * Created by nullpointer0x00 on 12/31/16.
 */
public class Activity {

    private Long id;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    @JsonProperty(value = "external_id")
    private String externalId;
    @JsonProperty(value = "upload_id")
    private Long uploadId;
    private Athlete athlete;
    private String name;
    private String description;
    private Float distance;
    @JsonProperty(value = "moving_time")
    private Integer movingTime;
    @JsonProperty(value = "elapsed_time")
    private Integer elapsedTime;
    @JsonProperty(value = "total_elevation_gain")
    private Float totalElevationGain;
    @JsonProperty(value = "elev_high")
    private Float elevHigh;
    @JsonProperty(value = "elev_low")
    private Float elevLow;
    @JsonProperty(value = "type")
    private ActivityType activityType;
    @JsonProperty(value = "start_date")
    private Date startDate;
    @JsonProperty(value = "start_date_local")
    private Date startDateLocal;
    @JsonProperty(value = "timezone")
    private String timezone;
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
    @JsonProperty(value = "achievement_count")
    private Integer achievementCount;
    @JsonProperty(value = "kudos_count")
    private Integer kudosCount;
    @JsonProperty(value = "comment_count")
    private Integer commentCount;
    @JsonProperty(value = "athlete_count")
    private Integer athleteCount;
    @JsonProperty(value = "photo_count")
    private Integer photoCount;
    @JsonProperty(value = "total_photo_count")
    private Integer totalPhotoCount;
    private Photo[] photos;
    private ActivityMap map;
    private Boolean trainer;
    private Boolean commute;
    private Boolean manual;
    private Boolean flagged;
    @JsonProperty(value = "private")
    private Boolean privateActivity;
    @JsonProperty(value = "workout_type")
    private Integer workoutType;
    @JsonProperty(value = "gear_id")
    private String gearId;
    private Gear gear;
    @JsonProperty(value = "average_speed")
    private Float averageSpeed;
    @JsonProperty(value = "max_speed")
    private Float maxSpeed;
    @JsonProperty(value = "average_cadence")
    private Float averageCadence;
    private Float kilojoules;
    @JsonProperty(value = "average_watts")
    private Float averageWatts;
    @JsonProperty(value = "device_watts")
    private Boolean deviceWatts;
    @JsonProperty(value = "average_temp")
    private Float averageTemp;
    @JsonProperty(value = "has_heartrate")
    private Boolean hasHeartrate;
    @JsonProperty(value = "average_heartrate")
    private Float averageHeartrate;
    @JsonProperty(value = "max_heartrate")
    private Float maxHeartrate;
    @JsonProperty(value = "calories")
    private Float calories;
    @JsonProperty(value = "has_kudoed")
    private Boolean hasKudoed;
    @JsonProperty(value = "segment_efforts")
    private SegmentEffort[] segmentEfforts;
    @JsonProperty(value = "splits_metric")
    private Split[] splitsMetric;
    @JsonProperty(value = "splits_standard")
    private Split[] splitsStandard;
    private Lap[] laps;
    @JsonProperty(value = "pr_count")
    private Integer prCount;
    @JsonProperty(value = "best_efforts")
    private SegmentEffort bestEfforts;
    @JsonProperty(value = "suffer_score")
    private Integer sufferScore;
    @JsonProperty(value = "location_city")
    private String locationCity;
    @JsonProperty(value = "location_state")
    private String locationState;
    @JsonProperty(value = "location_country")
    private String locationCountry;

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

    public Long getUploadId() {
        return uploadId;
    }

    public void setUploadId(Long uploadId) {
        this.uploadId = uploadId;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Float getTotalElevationGain() {
        return totalElevationGain;
    }

    public void setTotalElevationGain(Float totalElevationGain) {
        this.totalElevationGain = totalElevationGain;
    }

    public Float getElevHigh() {
        return elevHigh;
    }

    public void setElevHigh(Float elevHigh) {
        this.elevHigh = elevHigh;
    }

    public Float getElevLow() {
        return elevLow;
    }

    public void setElevLow(Float elevLow) {
        this.elevLow = elevLow;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
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

    public Integer getAchievementCount() {
        return achievementCount;
    }

    public void setAchievementCount(Integer achievementCount) {
        this.achievementCount = achievementCount;
    }

    public Integer getKudosCount() {
        return kudosCount;
    }

    public void setKudosCount(Integer kudosCount) {
        this.kudosCount = kudosCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getAthleteCount() {
        return athleteCount;
    }

    public void setAthleteCount(Integer athleteCount) {
        this.athleteCount = athleteCount;
    }

    public Integer getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    public Integer getTotalPhotoCount() {
        return totalPhotoCount;
    }

    public void setTotalPhotoCount(Integer totalPhotoCount) {
        this.totalPhotoCount = totalPhotoCount;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public ActivityMap getMap() {
        return map;
    }

    public void setMap(ActivityMap map) {
        this.map = map;
    }

    public Boolean getTrainer() {
        return trainer;
    }

    public void setTrainer(Boolean trainer) {
        this.trainer = trainer;
    }

    public Boolean getCommute() {
        return commute;
    }

    public void setCommute(Boolean commute) {
        this.commute = commute;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public Boolean getPrivateActivity() {
        return privateActivity;
    }

    public void setPrivateActivity(Boolean privateActivity) {
        this.privateActivity = privateActivity;
    }

    public Integer getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(Integer workoutType) {
        this.workoutType = workoutType;
    }

    public String getGearId() {
        return gearId;
    }

    public void setGearId(String gearId) {
        this.gearId = gearId;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Float getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Float averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public Float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Float getAverageCadence() {
        return averageCadence;
    }

    public void setAverageCadence(Float averageCadence) {
        this.averageCadence = averageCadence;
    }

    public Float getAverageWatts() {
        return averageWatts;
    }

    public void setAverageWatts(Float averageWatts) {
        this.averageWatts = averageWatts;
    }

    public Float getKilojoules() {
        return kilojoules;
    }

    public void setKilojoules(Float kilojoules) {
        this.kilojoules = kilojoules;
    }

    public Boolean getDeviceWatts() {
        return deviceWatts;
    }

    public void setDeviceWatts(Boolean deviceWatts) {
        this.deviceWatts = deviceWatts;
    }

    public Float getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(Float averageTemp) {
        this.averageTemp = averageTemp;
    }

    public Boolean getHasHeartrate() {
        return hasHeartrate;
    }

    public void setHasHeartrate(Boolean hasHeartrate) {
        this.hasHeartrate = hasHeartrate;
    }

    public Float getAverageHeartrate() {
        return averageHeartrate;
    }

    public void setAverageHeartrate(Float averageHeartrate) {
        this.averageHeartrate = averageHeartrate;
    }

    public Float getMaxHeartrate() {
        return maxHeartrate;
    }

    public void setMaxHeartrate(Float maxHeartrate) {
        this.maxHeartrate = maxHeartrate;
    }

    public Float getCalories() {
        return calories;
    }

    public void setCalories(Float calories) {
        this.calories = calories;
    }

    public Boolean getHasKudoed() {
        return hasKudoed;
    }

    public void setHasKudoed(Boolean hasKudoed) {
        this.hasKudoed = hasKudoed;
    }

    public SegmentEffort[] getSegmentEfforts() {
        return segmentEfforts;
    }

    public void setSegmentEfforts(SegmentEffort[] segmentEfforts) {
        this.segmentEfforts = segmentEfforts;
    }

    public Split[] getSplitsMetric() {
        return splitsMetric;
    }

    public void setSplitsMetric(Split[] splitsMetric) {
        this.splitsMetric = splitsMetric;
    }

    public Split[] getSplitsStandard() {
        return splitsStandard;
    }

    public void setSplitsStandard(Split[] splitsStandard) {
        this.splitsStandard = splitsStandard;
    }

    public SegmentEffort getBestEfforts() {
        return bestEfforts;
    }

    public void setBestEfforts(SegmentEffort bestEfforts) {
        this.bestEfforts = bestEfforts;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationState() {
        return locationState;
    }

    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    public void setLaps(Lap[] laps) {
        this.laps = laps;
    }

    public Integer getPrCount() {
        return prCount;
    }

    public void setPrCount(Integer prCount) {
        this.prCount = prCount;
    }

    public Lap[] getLaps() {
        return laps;
    }

    public Integer getSufferScore() {
        return sufferScore;
    }

    public void setSufferScore(Integer sufferScore) {
        this.sufferScore = sufferScore;
    }
}
