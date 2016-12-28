package com.beatnikstree.strava;

import com.beatnikstree.strava.util.URIBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/16/16.
 */
public class Connection {

    private int clientId;
    private String clientSecret;
    private String accessToken;
    private String redirectUri;

    public Connection(String accessToken){
        this.accessToken = accessToken;
    }

    public Connection(int clientId, String clientSecret, String redirectUri) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
    }

    public StravaResources getApi(){
        if(accessToken != null){
            return new StravaResources(accessToken);
        }
        return null;
    }

    private void authenticate(){

    }

}
