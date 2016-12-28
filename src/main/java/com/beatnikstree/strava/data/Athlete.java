package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by nullpointer0x00 on 12/28/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
    private Double weight;

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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //    {
//        "id": 227615,
//            "resource_state": 3,
//            "firstname": "John",
//            "lastname": "Applestrava",
//            "profile_medium": "http://pics.com/227615/medium.jpg",
//            "profile": "http://pics.com/227615/large.jpg",
//            "city": "San Francisco",
//            "state": "California",
//            "country": "United States",
//            "sex": "M",
//            "friend": null,
//            "follower": null,
//            "premium": true,
//            "created_at": "2008-01-01T17:44:00Z",
//            "updated_at": "2013-09-04T20:00:50Z",
//            "follower_count": 273,
//            "friend_count": 19,
//            "mutual_friend_count": 0,
//            "athlete_type": 0,
//            "date_preference": "%m/%d/%Y",
//            "measurement_preference": "feet",
//            "email": "john@applestrava.com",
//            "ftp": 280,
//            "weight": 68.7,
//            "clubs": [
//        {
//            "id": 1,
//                "resource_state": 2,
//                "name": "Team Strava Cycling",
//                "profile_medium": "http://pics.com/clubs/1/medium.jpg",
//                "profile": "http://pics.com/clubs/1/large.jpg",
//                "cover_photo": "http://pics.com/clubs/1/cover/large.jpg",
//                "cover_photo_small": "http://pics.com/clubs/1/cover/small.jpg",
//                "sport_type": "cycling",
//                "city": "San Francisco",
//                "state": "California",
//                "country": "United States",
//                "private": true,
//                "member_count": 23,
//                "featured": false,
//                "url": "strava-cycling"
//        }
//        ],
//        "bikes": [
//        {
//            "id": "b105763",
//                "primary": false,
//                "name": "Cannondale TT",
//                "distance": 476612.9,
//                "resource_state": 2
//        },
//        {
//            "id": "b105762",
//                "primary": true,
//                "name": "Masi",
//                "distance": 9000578.2,
//                "resource_state": 2
//        }
//        ],
//        "shoes": [
//        {
//            "id": "g1",
//                "primary": true,
//                "name": "Running Shoes",
//                "distance": 67492.9,
//                "resource_state": 2
//        }
//        ]
}
