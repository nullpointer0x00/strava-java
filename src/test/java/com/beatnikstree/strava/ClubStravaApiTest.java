package com.beatnikstree.strava;

import com.beatnikstree.strava.data.Annoucement;
import com.beatnikstree.strava.data.Club;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

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

    @Test
    public void clubStravaApiShouldReturnClubAnnouncements() throws Exception {
        List<Annoucement> annoucements = stravaResources.getClubStravaApi().getClubAnnouncements(254086);
        assertNotNull(annoucements);
        assertEquals(1, annoucements.size());
        assertEquals(254086, (int) annoucements.get(0).getId());
    }

    @Test
    public void clubStravaApiShouldReturnAthletesClubs() throws Exception {
        List<Club> clubs = stravaResources.getClubStravaApi().getClubs();
        assertNotNull(clubs);
        assertTrue(clubs.size() > 0);
    }
}
