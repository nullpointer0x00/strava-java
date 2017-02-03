package com.beatnikstree.strava;

import com.beatnikstree.strava.data.Annoucement;
import com.beatnikstree.strava.data.Athlete;
import com.beatnikstree.strava.data.Club;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Test for {@link ClubStravaApi}
 * <p>
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
    @Ignore("I believe this is not longer supported.")
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

    @Test
    public void clubStravaApiShouldReturnClubMembers() throws Exception {
        List<Athlete> athletes = stravaResources.getClubStravaApi().getClubMembers(1);
        assertNotNull(athletes);
        assertTrue(athletes.size() > 0);
    }

    @Test
    public void clubStravaApiShouldReturnClubMembersPaged() throws Exception {
        Set<Long> ids = new HashSet<>();
        List<Athlete> athletes = stravaResources.getClubStravaApi().getClubMembers(1, 10, 2);
        assertNotNull(athletes);
        assertEquals(10, athletes.size());
        athletes.stream().forEach(athlete -> assertTrue("Id should not be in set: " + athlete.getId(), ids.add(athlete.getId())));

        athletes = stravaResources.getClubStravaApi().getClubMembers(1, 10, 3);
        assertNotNull(athletes);
        assertEquals(10, athletes.size());
        athletes.stream().forEach(athlete -> assertTrue("Id should not be in set: " + athlete.getId(), ids.add(athlete.getId())));
    }
}
