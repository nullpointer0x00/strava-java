package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;
import com.sun.jndi.toolkit.url.Uri;

import java.net.URI;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/27/16.
 */
public class AthleteStravaApi extends AbstractStravaApi {

    public enum AthleteSex {
        MALE("M"),
        FEMALE("F"),
        RATHER_NOT_SAY("RATHER_NOT_SAY"),
        DO_NOT_UPDATE("DO_NOT_UPDATE");


        private String value;

        AthleteSex(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return this.getValue();
        }
    }

    public AthleteStravaApi(String apiKey) {
        super(apiKey);
    }

    public Athlete getAthelete() throws Exception {
        URI uri = this.buildUri("athlete");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, Athlete.class);
        }
        return null;
    }

    public Athlete getAthelete(Long id) throws Exception {
        URI uri = this.buildUri("athletes/" + id);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, Athlete.class);
        }
        return null;
    }


    public Zones getAthleteZones() throws Exception {
        URI uri = this.buildUri("athlete/zones");
        String response = doJsonGet(uri);
        ;
        if (response != null) {
            return objectMapper.readValue(response, Zones.class);
        }
        return null;
    }

    public Stats getAthleteStats(Long id) throws Exception {
        URI uri = this.buildUri("athletes/" + id + "/stats");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, Stats.class);
        }
        return null;
    }

    public List<SegmentEffort> getListAthleteKOMS(Long id) throws Exception {
        return getListAthleteKOMS(id, 0, 0);
    }

    public List<SegmentEffort> getListAthleteKOMS(Long id, int perPage, int page) throws Exception {
        Map<String, String> params = new HashMap<>();
        if (perPage != 0) {
            params.put("per_page", perPage + "");
        }
        if (page != 0) {
            params.put("page", page + "");
        }
        URI uri = this.buildUri("athletes/" + id + "/koms", params);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, SegmentEffortList.class);
        }
        return null;
    }

//    public Athlete updateCurrentAthlete(String city, String state, AthleteSex athleteSex, Float weight) throws Exception {
//        ActivityMap<String, String> requestProperties = new HashMap<>();
//        requestProperties.put("Accept", "application/json");
//        requestProperties.put("Authorization", "Bearer "+ apiKey);
//        if(city != null){
//            requestProperties.put("city", city);
//        }
//        if(state != null){
//            requestProperties.put("state", state);
//        }
//        if(athleteSex != AthleteSex.DO_NOT_UPDATE){
//            requestProperties.put("sex", athleteSex.value);
//        }
//        if(weight != null){
//            requestProperties.put("weight", weight + "");
//        }
//        URI uri = this.buildUri("athlete");
//        HttpActions action = new HttpActions();
//        String response = action.doExecute(uri, "PUT", requestProperties);
//        if(response != null){
//            return objectMapper.readValue(response, Athlete.class);
//        }
//        return null;
//    }


}
