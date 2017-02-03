package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Annoucement> getClubAnnouncements(int clubId) throws Exception {
        URI uri = this.buildUri("clubs/" + clubId + "/announcements");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, AnnoucementList.class);
        }
        return null;
    }

    public List<Club> getClubs() throws Exception {
        URI uri = this.buildUri("athlete/clubs");
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, ClubList.class);
        }
        return null;
    }

    public List<Athlete> getClubMembers(int clubId) throws Exception {
        return getClubMembers(clubId, 0, 0);

    }

    public List<Athlete> getClubMembers(int clubId, int perPage, int page) throws Exception {
        Map<String, String> params = new HashMap<>();
        if (perPage != 0) {
            params.put("per_page", perPage + "");
        }
        if (page != 0) {
            params.put("page", page + "");
        }
        URI uri = this.buildUri("clubs/" + clubId + "/members", params);
        String response = doJsonGet(uri);
        if (response != null) {
            return objectMapper.readValue(response, AthleteList.class);
        }
        return null;
    }

}
