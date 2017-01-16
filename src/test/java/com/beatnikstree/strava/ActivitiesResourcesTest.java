package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;
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
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getAthleteActivities();
        assertNotNull(activities);
        assertEquals(30, activities.size());
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesPaged() throws Exception {
        Set<Long> set = new HashSet<>();
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getAthleteActivities(1, 10);
        assertNotNull(activities);
        assertEquals(10, activities.size());

        set.addAll(activities.stream().map(i -> i.getId()).collect(Collectors.toList()));

        activities = stravaResources.getActivitiesStravaApi().getAthleteActivities(2, 10);
        assertEquals(10, activities.size());
        activities.stream().forEach(a -> assertTrue("There should be no repeat ids. Set already contains: " + a.getId(), !set.contains(a.getId())));
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesAfter() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesAfter(cal.getTime());
        assertNotNull(activities);
        assertEquals(30, activities.size());
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().after(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesAfterPerPage() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesAfter(cal.getTime(), 10);
        assertNotNull(activities);
        assertEquals(10, activities.size());
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().after(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesBefore() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesBefore(cal.getTime());
        assertNotNull(activities);
        assertEquals(30, activities.size());
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().before(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesBeforePage() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getAthleteActivitiesBefore(cal.getTime(), 10);
        assertNotNull(activities);
        assertEquals(10, activities.size());
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().before(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldGetFriendsActivites() throws Exception {
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getFriendsActivities();
        assertNotNull(activities);
        assertTrue(activities.size() > 0);
    }

    @Test
    public void activitesStravaApiShouldGetFriendsPaged() throws Exception {
        Set<Long> set = new HashSet<>();
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getFriendActivities(1, 5);
        assertNotNull(activities);
        assertEquals(5, activities.size());
        set.addAll(activities.stream().map(i -> i.getId()).collect(Collectors.toList()));

        activities = stravaResources.getActivitiesStravaApi().getFriendActivities(2, 5);
        assertEquals(5, activities.size());
        activities.stream().forEach(a -> assertTrue("There should be no repeat ids. Set already contains: " + a.getId(), !set.contains(a.getId())));
    }

    @Test
    public void activitesStravaApiShouldGetFriendsBeforeDate() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -7);
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getFriendsActivitiesBefore(cal.getTime());
        assertNotNull(activities);
        assertEquals(30, activities.size());

        for (Activity activity : activities) {
            assertTrue("Date " + activity.getStartDate() + " is not before " + cal.getTime(), activity.getStartDate().before(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldGetFriendsBeforeDatePerPage() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -7);
        List<Activity> activities = stravaResources.getActivitiesStravaApi().getFriendsActivitiesBefore(cal.getTime(), 2);
        assertNotNull(activities);
        assertEquals(2, activities.size());

        for (Activity activity : activities) {
            assertTrue("Date " + activity.getStartDate() + " is not before " + cal.getTime(), activity.getStartDate().before(cal.getTime()));
        }
    }
}
