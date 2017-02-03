package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *
 * Test for {@link AthleteStravaApi}
 *
 * Created by nullpointer0x00 on 12/28/16.
 */
public class AthleteStravaApiTest {

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
    public void athleteStravaApiShouldGetCurrentAthlete() throws Exception {
        Athlete athlete = stravaResources.getAthleteStravaApi().getAthelete();
        assertNotNull(athlete);
    }

    @Test
    public void athleteStravaApiShouldGetAthleteById() throws Exception {
        Athlete athlete = stravaResources.getAthleteStravaApi().getAthelete(1481479L);
        assertNotNull(athlete);
    }

//    @Test
//    public void athleteStravaApiShouldUpdateAthlete() throws Exception {
//        Athlete athlete = stravaResources.getAthleteStravaApi().updateCurrentAthlete("some-city", "some-state", AthleteStravaApi.AthleteSex.RATHER_NOT_SAY, new Float(2.3));
//        assertNotNull(athlete);
//    }

    @Test
    public void athleteStravaApiShouldGetAthleteZones() throws Exception {
        Zones zones = stravaResources.getAthleteStravaApi().getAthleteZones();
        assertNotNull(zones);
    }

    @Test
    @Ignore("In order for this test to work.  You must enter one of your friend's ids. ")
    public void athleteStravaApiShouldGetAthleteStats() throws Exception {
        Long myFriendId = 227615L;
        Stats stats = stravaResources.getAthleteStravaApi().getAthleteStats(myFriendId);
        assertNotNull(stats);
    }

    @Test
    public void athleteStravaApiShouldGetListAthleteKMOS() throws Exception {
        List<SegmentEffort> stats = stravaResources.getAthleteStravaApi().getListAthleteKOMS(1481479L);
        assertNotNull(stats);
    }

    @Test
    public void athleteStravaApiShouldGetListAthleteKMOSWithPages() throws Exception {
        List<SegmentEffort> stats = stravaResources.getAthleteStravaApi().getListAthleteKOMS(1481479L, 1, 3);
        assertNotNull(stats);
        assertEquals(1, stats.size());
    }

}
