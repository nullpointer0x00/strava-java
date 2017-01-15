package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
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

    @Test
    public void activitesStravaApiShouldGetFriendsActivites() throws Exception {
        Activity[] activities = stravaResources.getActivitiesStravaApi().getFriendsActivities();
        assertNotNull(activities);
        assertTrue(activities.length > 0);
    }

    @Test
    public void activitesStravaApiShouldGetFriendsPaged() throws Exception {
        Set<Long> set = new HashSet<>();
        Activity[] activities = stravaResources.getActivitiesStravaApi().getFriendActivities(1, 5);
        assertNotNull(activities);
        assertEquals(5, activities.length);
        set.addAll(Arrays.stream(activities).map(i -> i.getId()).collect(Collectors.toList()));

        activities = stravaResources.getActivitiesStravaApi().getFriendActivities(2, 5);
        assertEquals(5, activities.length);
        Arrays.stream(activities).forEach(a -> assertTrue("There should be no repeat ids. Set already contains: " + a.getId(), !set.contains(a.getId())));
    }

    @Test
    public void activitesStravaApiShouldGetFriendsBeforeDate() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -7);
        Activity[] activities = stravaResources.getActivitiesStravaApi().getFriendsActivitiesBefore(cal.getTime());
        assertNotNull(activities);
        assertEquals(30, activities.length);

        for (Activity activity : activities) {
            assertTrue("Date " + activity.getStartDate() + " is not before " + cal.getTime(), activity.getStartDate().before(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldGetFriendsBeforeDatePerPage() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -7);
        Activity[] activities = stravaResources.getActivitiesStravaApi().getFriendsActivitiesBefore(cal.getTime(), 2);
        assertNotNull(activities);
        assertEquals(2, activities.length);

        for (Activity activity : activities) {
            assertTrue("Date " + activity.getStartDate() + " is not before " + cal.getTime(), activity.getStartDate().before(cal.getTime()));
        }
    }
}
