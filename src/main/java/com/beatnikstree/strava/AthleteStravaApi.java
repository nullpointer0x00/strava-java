package com.beatnikstree.strava;

import com.beatnikstree.strava.data.Athlete;
import com.sun.jndi.toolkit.url.Uri;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/27/16.
 */
public class AthleteStravaApi extends AbstractStravaApi {

    public AthleteStravaApi(String apiKey){
        super(apiKey);
    }

    public Athlete getAthelete() throws Exception {
        Map<String, String> requestProperties = new HashMap<>();
        requestProperties.put("Accept", "application/json");
        requestProperties.put("Authorization", "Bearer "+ apiKey);
        URI uri = this.buildUri("athlete");
        HttpActions action = new HttpActions();
        String response = action.doExecute(uri, "GET", requestProperties);
        if(response != null){
            return objectMapper.readValue(response, Athlete.class);
        }
        return null;
    }

    public Athlete getAthelete(Long id) throws Exception {
        Map<String, String> requestProperties = new HashMap<>();
        requestProperties.put("Accept", "application/json");
        requestProperties.put("Authorization", "Bearer "+ apiKey);
        URI uri = this.buildUri("athletes/" + id);
        HttpActions action = new HttpActions();
        String response = action.doExecute(uri, "GET", requestProperties);
        if(response != null){
            return objectMapper.readValue(response, Athlete.class);
        }
        return null;
    }
}
