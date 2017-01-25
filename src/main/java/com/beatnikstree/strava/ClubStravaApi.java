package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;

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

    public List<Annoucement> getClubAnnouncements(int clubId)  throws Exception{
        URI uri = this.buildUri("clubs/" + clubId + "/announcements");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, AnnoucementList.class);
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
