package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by nullpointer0x00 on 12/30/16.
 */
public class Stats implements Serializable {

    @JsonProperty(value = "biggest_ride_distance")
    private Float biggestRideDistance;
    @JsonProperty(value = "biggest_climb_elevation_gain")
    private Float biggestClimbElevationGain;
    @JsonProperty(value = "recent_ride_totals")
    private Totals recentRideTotals;
    @JsonProperty(value = "recent_run_totals")
    private Totals recentRunTotals;
    @JsonProperty(value = "recent_swim_totals")
    private Totals recentSwimTotals;
    @JsonProperty(value = "ytd_ride_totals")
    private Totals ytdRideTotals;
    @JsonProperty(value = "ytd_run_totals")
    private Totals ytdRunTotals;
    @JsonProperty(value = "ytd_swim_totals")
    private Totals ytdSwimTotals;
    @JsonProperty(value = "all_ride_totals")
    private Totals allRideTotals;
    @JsonProperty(value = "all_run_totals")
    private Totals allRunTotals;
    @JsonProperty(value = "all_swim_totals")
    private Totals allSwimTotals;

    public Float getBiggestRideDistance() {
        return biggestRideDistance;
    }

    public void setBiggestRideDistance(Float biggestRideDistance) {
        this.biggestRideDistance = biggestRideDistance;
    }

    public Float getBiggestClimbElevationGain() {
        return biggestClimbElevationGain;
    }

    public void setBiggestClimbElevationGain(Float biggestClimbElevationGain) {
        this.biggestClimbElevationGain = biggestClimbElevationGain;
    }

    public Totals getRecentRideTotals() {
        return recentRideTotals;
    }

    public void setRecentRideTotals(Totals recentRideTotals) {
        this.recentRideTotals = recentRideTotals;
    }

    public Totals getRecentRunTotals() {
        return recentRunTotals;
    }

    public void setRecentRunTotals(Totals recentRunTotals) {
        this.recentRunTotals = recentRunTotals;
    }

    public Totals getRecentSwimTotals() {
        return recentSwimTotals;
    }

    public void setRecentSwimTotals(Totals recentSwimTotals) {
        this.recentSwimTotals = recentSwimTotals;
    }

    public Totals getYtdRideTotals() {
        return ytdRideTotals;
    }

    public void setYtdRideTotals(Totals ytdRideTotals) {
        this.ytdRideTotals = ytdRideTotals;
    }

    public Totals getYtdRunTotals() {
        return ytdRunTotals;
    }

    public void setYtdRunTotals(Totals ytdRunTotals) {
        this.ytdRunTotals = ytdRunTotals;
    }

    public Totals getYtdSwimTotals() {
        return ytdSwimTotals;
    }

    public void setYtdSwimTotals(Totals ytdSwimTotals) {
        this.ytdSwimTotals = ytdSwimTotals;
    }

    public Totals getAllRideTotals() {
        return allRideTotals;
    }

    public void setAllRideTotals(Totals allRideTotals) {
        this.allRideTotals = allRideTotals;
    }

    public Totals getAllRunTotals() {
        return allRunTotals;
    }

    public void setAllRunTotals(Totals allRunTotals) {
        this.allRunTotals = allRunTotals;
    }

    public Totals getAllSwimTotals() {
        return allSwimTotals;
    }

    public void setAllSwimTotals(Totals allSwimTotals) {
        this.allSwimTotals = allSwimTotals;
    }
}
