package com.beatnikstree.strava;

import com.beatnikstree.strava.util.URIBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/27/16.
 */
public abstract class AbstractStravaApi {

    protected final String apiKey;

    protected ObjectMapper objectMapper = new ObjectMapper();

    public AbstractStravaApi(String apiKey){
        this.apiKey = apiKey;
    }

    protected URI buildUri(String path) {
        return buildUri(path, EMPTY_PARAMETERS);
    }

    protected URI buildUri(String path, String parameterName, String parameterValue) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put(parameterName, parameterValue);
        return buildUri(path, parameters);
    }

    protected URI buildUri(String path, Map<String, String> parameters) {
        return URIBuilder.fromUri(API_URL_BASE + path).queryParams(parameters).build();
    }

    private static final String API_URL_BASE = "https://www.strava.com/api/v3/";

    private static final Map<String, String> EMPTY_PARAMETERS = new HashMap<String, String>();

}
