package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by nullpointer0x00 on 1/24/17.
 */
public class Annoucement {

    private Integer id;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;
    private Athlete athlete;
    @JsonProperty(value = "club_id")
    private Integer clubId;
    @JsonProperty(value = "created_at")
    private Date createdAt;
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResourceState() {
        return resourceState;
    }

    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
