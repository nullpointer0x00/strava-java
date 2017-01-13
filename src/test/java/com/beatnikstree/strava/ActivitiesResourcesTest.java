package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.util.Calendar;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by nullpointer0x00 on 12/28/16.
 */
public class ActivitiesResourcesTest {

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
    public void activitesStravaApiShouldGetActivityById() throws Exception {
        Activity activity = stravaResources.getActivitiesStravaApi().getActivity(829679899L);
        assertNotNull(activity);
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivites() throws Exception {
        Activity[] activities = stravaResources.getActivitiesStravaApi().getAthleteActivities();
        assertNotNull(activities);
        assertTrue(activities.length > 0);
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesPaged() throws Exception {
        Activity[] activities = stravaResources.getActivitiesStravaApi().getAthleteActivities(1, 10);
        assertNotNull(activities);
        assertEquals(10, activities.length);
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesAfter() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        Activity[] activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesAfter(cal.getTime());
        assertNotNull(activities);
        assertTrue(activities.length > 0);
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().after(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesAfterPerPage() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        Activity[] activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesAfter(cal.getTime(), 10);
        assertNotNull(activities);
        assertEquals(10, activities.length);
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().after(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesBefore() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        Activity[] activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesBefore(cal.getTime());
        assertNotNull(activities);
        assertTrue(activities.length > 0);
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().before(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesBeforePage() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        Activity[] activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesBefore(cal.getTime(), 10);
        assertNotNull(activities);
        assertEquals(10, activities.length);
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().before(cal.getTime()));
        }
    }
}
