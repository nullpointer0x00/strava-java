package com.beatnikstree.strava;

import com.beatnikstree.strava.data.Club;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.InputStream;

/**
 * Created by nullpointer0x00 on 1/16/17.
 */
public class ClubStravaApiTest {

    String accessToken;
    StravaResources stravaResources;

    @Before
    public void setUp() throws Exception {
        //must add strava-access-token.txt to src/test/resources folder
        //file must contain one line with your strava access token
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("strava-access-token.txt");
        accessToken = IOUtils.toString(stream, "UTF-8");
        this.stravaResources = new StravaResources(accessToken);
    }

    @Test
    public void clubStravaApiShouldReturnClubById() throws Exception {
        Club club = stravaResources.getClubStravaApi().getClub(1L);
        assertNotNull(club);
    }
}
