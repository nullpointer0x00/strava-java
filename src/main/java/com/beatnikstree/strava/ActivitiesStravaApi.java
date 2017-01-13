package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/27/16.
 */
public class ActivitiesStravaApi extends AbstractStravaApi {

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

    public ActivitiesStravaApi(String apiKey) {
        super(apiKey);
    }

    public Activity getActivity(Long id) throws Exception {
        URI uri = this.buildUri("activities/" + id);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, Activity.class);
        }
        return null;
    }

    public Activity[] getAthleteActivities() throws Exception {
        return getAthleteActivities(null, null, null, null);
    }

    public Activity[] getAthleteActivities(int page, int perPage) throws Exception {
        return getAthleteActivities(null, null, page, perPage);
    }

    public Activity[] getAthleteActivitiesBefore(Date before) throws Exception {
        return getAthleteActivities(before, null, null, null);
    }

    public Activity[] getAthleteActivitiesBefore(Date before, int perPage) throws Exception {
        return getAthleteActivities(before, null, null, perPage);
    }

    public Activity[] getAthleteActivitiesAfter(Date after) throws Exception {
        return getAthleteActivities(null, after, null, null);
    }

    public Activity[] getAthleteActivitiesAfter(Date after, int perPage) throws Exception {
        return getAthleteActivities(null, after, null, perPage);
    }

    private Activity[] getAthleteActivities(Date before, Date after, Integer page, Integer perPage) throws Exception {
        Map<String, String> params = new HashMap<>();
        if (before != null) {
            params.put("before", (before.getTime() / 1000) + "");
        }
        if (after != null) {
            params.put("after", (after.getTime() / 1000) + "");
        }
        if (page != null) {
            params.put("page", page + "");
        }
        if (perPage != null) {
            params.put("per_page", perPage + "");
        }
        URI uri = this.buildUri("athlete/activities", params);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, Activity[].class);
        }
        return null;
    }

}
