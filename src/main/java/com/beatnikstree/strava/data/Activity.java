package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nullpointer0x00 on 12/31/16.
 */
public class Activity {

    private Long id;
    @JsonProperty(value = "resource_state")
    private Integer resourceState;

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
}
