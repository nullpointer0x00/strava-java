package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by nullpointer0x00 on 12/28/16.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class Athlete implements Serializable {

    private Long id;
    private String username;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    private String firstname;
    private String lastname;
    @JsonProperty(value = "profile_medium")
    private String profileMedium;
    private String profile;
    private String city;
    private String state;
    private String country;
    private String sex;
    private String friend;
    private String follower;
    private Boolean premium;
    @JsonProperty(value = "created_at")
    private Date createdAt;
    @JsonProperty(value = "updated_at")
    private Date updatedAt;
    @JsonProperty(value = "badge_type_id")
    private Integer badgeTypeId;
    @JsonProperty(value = "follower_count")
    private Integer followerCount;
    @JsonProperty(value = "friend_count")
    private Integer friendCount;
    @JsonProperty(value = "mutual_friend_count")
    private Integer mutualFriendCount;
    @JsonProperty(value = "athlete_type")
    private Integer athleteType;
    @JsonProperty(value = "date_preference")
    private String datePreference;
    @JsonProperty(value = "measurement_preference")
    private String measurementPreference;
    private String email;
    private Integer ftp;
    private Float weight;
    private Club[] clubs;
    private Gear[] bikes;
    private Gear[] shoes;


    public Athlete() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getResourceState() {
        return resourceState;
    }

    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfileMedium() {
        return profileMedium;
    }

    public void setProfileMedium(String profileMedium) {
        this.profileMedium = profileMedium;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getBadgeTypeId() {
        return badgeTypeId;
    }

    public void setBadgeTypeId(Integer badgeTypeId) {
        this.badgeTypeId = badgeTypeId;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public Integer getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(Integer friendCount) {
        this.friendCount = friendCount;
    }

    public Integer getMutualFriendCount() {
        return mutualFriendCount;
    }

    public void setMutualFriendCount(Integer mutualFriendCount) {
        this.mutualFriendCount = mutualFriendCount;
    }

    public Integer getAthleteType() {
        return athleteType;
    }

    public void setAthleteType(Integer athleteType) {
        this.athleteType = athleteType;
    }

    public String getDatePreference() {
        return datePreference;
    }

    public void setDatePreference(String datePreference) {
        this.datePreference = datePreference;
    }

    public String getMeasurementPreference() {
        return measurementPreference;
    }

    public void setMeasurementPreference(String measurementPreference) {
        this.measurementPreference = measurementPreference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFtp() {
        return ftp;
    }

    public void setFtp(Integer ftp) {
        this.ftp = ftp;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Club[] getClubs() {
        return clubs;
    }

    public void setClubs(Club[] clubs) {
        this.clubs = clubs;
    }

    public Gear[] getBikes() {
        return bikes;
    }

    public void setBikes(Gear[] bikes) {
        this.bikes = bikes;
    }

    public Gear[] getShoes() {
        return shoes;
    }

    public void setShoes(Gear[] shoes) {
        this.shoes = shoes;
    }
}
