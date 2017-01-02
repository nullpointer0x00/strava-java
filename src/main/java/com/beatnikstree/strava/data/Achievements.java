package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nullpointer0x00 on 1/2/17.
 */
public class Achievements {

    private Long id;
    private String type;
    private Integer rank;
    @JsonProperty(value = "type_id")
    private Integer typeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
