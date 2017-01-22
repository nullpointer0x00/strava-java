package com.beatnikstree.strava;

import com.beatnikstree.strava.data.Athlete;
import com.beatnikstree.strava.data.Club;
import com.beatnikstree.strava.data.ClubList;

import java.net.URI;
import java.util.List;

/**
 * Created by nullpointer0x00 on 1/16/17.
 */
public class ClubStravaApi extends AbstractStravaApi {

    public ClubStravaApi(String apiKey) {
        super(apiKey);
    }

    public Club getClub(long id) throws Exception {
        URI uri = this.buildUri("clubs/" + id);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, Club.class);
        }
        return null;
    }

    public List<Club> getClubs() throws Exception {
        URI uri = this.buildUri("/athlete/clubs");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, ClubList.class);
        }
        return null;
    }

}
