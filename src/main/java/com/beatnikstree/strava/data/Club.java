package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by nullpointer0x00 on 1/13/17.
 */
public class Club implements Serializable {
    private Long id;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    private String name;
    @JsonProperty(value = "profile_medium")
    private String profileMedium;
    private String profile;
    @JsonProperty(value = "cover_photo")
    private String coverPhoto;
    @JsonProperty(value = "cover_photo_small")
    private String coverPhotoSmall;
    private String description;
    @JsonProperty(value = "club_type")
    private String clubType;
    @JsonProperty(value = "sport_type")
    private String sportType;
    private String city;
    private String state;
    private String country;
    @JsonProperty(value = "private")
    private Boolean isPrivate;
    @JsonProperty(value = "member_count")
    private Integer memberCount;
    private Boolean featured;
    private Boolean verified;
    private String membership;
    private Boolean admin;
    private Boolean owner;
    @JsonProperty(value = "following_count")
    private Integer followingCount;
    private String url;

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

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getCoverPhotoSmall() {
        return coverPhotoSmall;
    }

    public void setCoverPhotoSmall(String coverPhotoSmall) {
        this.coverPhotoSmall = coverPhotoSmall;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClubType() {
        return clubType;
    }

    public void setClubType(String clubType) {
        this.clubType = clubType;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
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

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
