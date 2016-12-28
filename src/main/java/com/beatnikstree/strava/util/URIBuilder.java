package com.beatnikstree.strava.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/23/16.
 */
public class URIBuilder {

    private String baseUri;
    private Map<String, String> params;

    //URIBuilder.fromUri(API_URL_BASE + path).queryParams(parameters).build();

    private URIBuilder(String baseUri) {
        this.baseUri = baseUri;
        params = new HashMap<String, String>();
    }

    public static URIBuilder fromUri(String baseUri) {
        return new URIBuilder(baseUri);
    }

    public  URIBuilder queryParams(Map<String, String> params){
        this.params.putAll(params);
        return this;
    }

    public URI build()  {
        try {
            StringBuffer sb = new StringBuffer(baseUri);
            if(!params.isEmpty()){
                sb.append("?");
                params.keySet().stream().forEach(key -> {
                    String value = params.get(key);
                    if(sb.charAt(sb.length() - 1 ) != '?'){
                        sb.append("&");
                    }
                    sb.append(key);
                    sb.append("=");
                    sb.append(value);

                });
            }
            return new URI(sb.toString());
        } catch (URISyntaxException e){
            return null;
        }
    }
}
