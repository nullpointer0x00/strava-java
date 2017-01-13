package com.beatnikstree.strava.data;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by nullpointer0x00 on 1/2/17.
 */
public enum ActivityType {

    RIDE("Ride"),
    RUN("Run"),
    SWIM("Swim"),
    HIKE("Hike"),
    WALK("Walk"),
    ALPINE_SKI("AlpineSki"),
    BACKCOUNTRY_SKI("BackcountrySki"),
    CANOEING("Canoeing"),
    CROSSFIT("Crossfit"),
    E_BIKE_RIDE("EBikeRide"),
    ELLIPTICAL("Elliptical"),
    ICE_SKATE("IceSkate"),
    INLINE_SKATE("InlineSkate"),
    KAYAKING("Kayaking"),
    YOGA("Yoga"),
    KITESURF("Kitesurf"),
    NORDIC_SKI("NordicSki"),
    ROCK_CLIMBING("RockClimbing"),
    ROLLER_SKI("RollerSki"),
    ROWING("Rowing"),
    SNOWBOARD("Snowboard"),
    SNOWSHOE("Snowshoe"),
    STAIR_STEPPER("StairStepper"),
    STAND_UP_PADDLING("StandUpPaddling"),
    SURFING("Surfing"),
    VIRTUAL_RIDE("VirtualRide"),
    WEIGHT_TRAINING("WeightTraining"),
    WINDSURF("Windsurf"),
    WORKOUT("Workout");

    private String value;

    ActivityType(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
