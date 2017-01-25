package com.beatnikstree.strava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/16/16.
 */
public class HttpActions {

    protected String doExecute(URI url, String method) throws Exception {
        return doExecute(url, method, null);
    }

    protected String doExecute(URI url, String method, Map<String, String> headers) throws Exception {

        StringBuffer sb = new StringBuffer();
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.toURL().openConnection();
            connection.setRequestMethod(method);
            if(headers != null){
                for(String key : headers.keySet()){
                    connection.setRequestProperty(key, headers.get(key));
                }
            }

            if ("GET".equals(method)) {
                connection.setInstanceFollowRedirects(true);
            }
            else {
                connection.setInstanceFollowRedirects(false);
            }

            if ("POST".equals(method) || "PUT".equals(method) ||
                    "PATCH".equals(method) || "DELETE".equals(method)) {
                connection.setDoOutput(true);
            }
            else {
                connection.setDoOutput(false);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String output;
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
        }
        catch (IOException ex) {
            String resource = url.toString();
            String query = url.getRawQuery();
            resource = (query != null ? resource.substring(0, resource.indexOf(query) - 1) : resource);
            throw new Exception("I/O error on " + method +
                    " request for \"" + resource + "\": " + ex.getMessage(), ex);
        } catch (Exception ex){
            throw new Exception("Exception error on " + method +
                    " request for \"" + url.getPath() + "\": " + ex.getMessage(), ex);
        }
        finally {
            if (connection != null) {
                connection.disconnect();
            }
            return sb.toString();
        }
    }

}
