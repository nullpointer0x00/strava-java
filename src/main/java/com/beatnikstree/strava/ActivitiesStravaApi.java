package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/27/16.
 */
public class ActivitiesStravaApi extends AbstractStravaApi {

    public enum AthleteSex{
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

    public ActivitiesStravaApi(String apiKey){
        super(apiKey);
    }

    public Activity getActivity(Long id) throws Exception {
        URI uri = this.buildUri("activities/" + id);
        String response = doJsonGet(uri);
        if(response != null){
            return objectMapper.readValue(response, Activity.class);
        }
        return null;
    }

}
