package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nullpointer0x00 on 12/30/16.
 */
public class Power implements Serializable {

    private List<Zone> powerZones;

    public List<Zone> getPowerZones() {
        return powerZones;
    }

    public void setPowerZones(List<Zone> powerZones) {
        this.powerZones = powerZones;
    }
}
