package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

    public Activity getActivity(long id) throws Exception {
        URI uri = this.buildUri("activities/" + id);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, Activity.class);
        }
        return null;
    }

    public List<Activity> getAthleteActivities() throws Exception {
        return getAthleteActivities(null, null, null, null);
    }

    public List<Activity> getAthleteActivities(int page, int perPage) throws Exception {
        return getAthleteActivities(null, null, page, perPage);
    }

    public List<Activity> getAthleteActivitiesBefore(Date before) throws Exception {
        return getAthleteActivities(before, null, null, null);
    }

    public List<Activity> getAthleteActivitiesBefore(Date before, int perPage) throws Exception {
        return getAthleteActivities(before, null, null, perPage);
    }

    public List<Activity> getAthleteActivitiesAfter(Date after) throws Exception {
        return getAthleteActivities(null, after, null, null);
    }

    public List<Activity> getAthleteActivitiesAfter(Date after, int perPage) throws Exception {
        return getAthleteActivities(null, after, null, perPage);
    }

    private List<Activity> getAthleteActivities(Date before, Date after, Integer page, Integer perPage) throws Exception {
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
            return objectMapper.readValue(response, ActivityList.class);
        }
        return null;
    }

    public List<Activity> getFriendsActivities() throws Exception {
        return getFriendsActivities(null, null, null);
    }

    public List<Activity> getFriendActivities(int page, int perPage) throws Exception {
        return getFriendsActivities(null, page, perPage);
    }

    public List<Activity> getFriendsActivitiesBefore(Date before) throws Exception {
        return getFriendsActivities(before, null, null);
    }

    public List<Activity> getFriendsActivitiesBefore(Date before, int perPage) throws Exception {
        return getFriendsActivities(before, null, perPage);
    }


    private List<Activity> getFriendsActivities(Date before, Integer page, Integer perPage) throws Exception {
        Map<String, String> params = new HashMap<>();
        if (before != null) {
            params.put("before", (before.getTime() / 1000) + "");
        }
        if (page != null) {
            params.put("page", page + "");
        }
        if (perPage != null) {
            params.put("per_page", perPage + "");
        }
        URI uri = this.buildUri("activities/following", params);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, ActivityList.class);
        }
        return null;
    }

    public List<Activity> getRelatedActivities(int id) throws Exception {
        return getRelatedActivities(id, null, null);
    }

    public List<Activity> getRelatedActivitiesPaged(int id, int page, int perPage) throws Exception {
        return getRelatedActivities(id, page, perPage);
    }

    private List<Activity> getRelatedActivities(int id, Integer page, Integer perPage) throws Exception {
        Map<String, String> params = new HashMap<>();
        if (page != null) {
            params.put("page", page + "");
        }
        if (perPage != null) {
            params.put("per_page", perPage + "");
        }
        URI uri = this.buildUri("activities/" + id + "/related", params);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, ActivityList.class);
        }
        return null;
    }

    public List<ActivityZones> getActivityZones(int id) throws Exception {
        URI uri = this.buildUri("activities/" + id + "/zones");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, ActivityZonesList.class);
        }
        return null;
    }

    public List<Lap> getActivityLaps(int id) throws Exception {
        URI uri = this.buildUri("activities/" + id + "/laps");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, LapList.class);
        }
        return null;
    }
}
