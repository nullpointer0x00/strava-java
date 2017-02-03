package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test for {@link ActivityStravaApi}
 *
 * Created by nullpointer0x00 on 12/28/16.
 */
public class ActivityStravaApiTest {

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
        Activity activity = stravaResources.getActivityStravaApi().getActivity(829679899L);
        assertNotNull(activity);
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivites() throws Exception {
        List<Activity> activities = stravaResources.getActivityStravaApi().getAthleteActivities();
        assertNotNull(activities);
        assertEquals(30, activities.size());
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesPaged() throws Exception {
        Set<Long> set = new HashSet<>();
        List<Activity> activities = stravaResources.getActivityStravaApi().getAthleteActivities(1, 10);
        assertNotNull(activities);
        assertEquals(10, activities.size());

        set.addAll(activities.stream().map(i -> i.getId()).collect(Collectors.toList()));

        activities = stravaResources.getActivityStravaApi().getAthleteActivities(2, 10);
        assertEquals(10, activities.size());
        activities.stream().forEach(a -> assertTrue("There should be no repeat ids. Set already contains: " + a.getId(), !set.contains(a.getId())));
    }

    @Test
    public void activitesStravaApiShouldAuthenticatedAthletesActivitesAfter() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 2, 2);
        List<Activity> activities = stravaResources.getActivityStravaApi().getAthleteActivitiesAfter(cal.getTime());
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
        List<Activity> activities = stravaResources.getActivityStravaApi().getAthleteActivitiesAfter(cal.getTime(), 10);
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
        List<Activity> activities = stravaResources.getActivityStravaApi().getAthleteActivitiesBefore(cal.getTime());
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
        List<Activity> activities = stravaResources.getActivityStravaApi().getAthleteActivitiesBefore(cal.getTime(), 10);
        assertNotNull(activities);
        assertEquals(10, activities.size());
        for (Activity activity : activities) {
            assertTrue(activity.getStartDate().before(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldGetFriendsActivites() throws Exception {
        List<Activity> activities = stravaResources.getActivityStravaApi().getFriendsActivities();
        assertNotNull(activities);
        assertTrue(activities.size() > 0);
    }

    @Test
    public void activitesStravaApiShouldGetFriendsPaged() throws Exception {
        Set<Long> set = new HashSet<>();
        List<Activity> activities = stravaResources.getActivityStravaApi().getFriendActivities(1, 5);
        assertNotNull(activities);
        assertEquals(5, activities.size());
        set.addAll(activities.stream().map(i -> i.getId()).collect(Collectors.toList()));

        activities = stravaResources.getActivityStravaApi().getFriendActivities(2, 5);
        assertEquals(5, activities.size());
        activities.stream().forEach(a -> assertTrue("There should be no repeat ids. Set already contains: " + a.getId(), !set.contains(a.getId())));
    }

    @Test
    public void activitesStravaApiShouldGetFriendsBeforeDate() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -7);
        List<Activity> activities = stravaResources.getActivityStravaApi().getFriendsActivitiesBefore(cal.getTime());
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
        List<Activity> activities = stravaResources.getActivityStravaApi().getFriendsActivitiesBefore(cal.getTime(), 2);
        assertNotNull(activities);
        assertEquals(2, activities.size());

        for (Activity activity : activities) {
            assertTrue("Date " + activity.getStartDate() + " is not before " + cal.getTime(), activity.getStartDate().before(cal.getTime()));
        }
    }

    @Test
    public void activitesStravaApiShouldGetRelatedActivities() throws Exception {
        List<Activity> activities = stravaResources.getActivityStravaApi().getRelatedActivities(132865910);
        assertNotNull(activities);
        assertEquals(29, activities.size());
    }

    @Test
    public void activitesStravaApiShouldGetRelatedActivitiesPaged() throws Exception {
        Set<Long> set = new HashSet<>();
        List<Activity> activities = stravaResources.getActivityStravaApi().getRelatedActivitiesPaged(132865910, 1, 15);
        assertNotNull(activities);
        assertEquals(15, activities.size());
        set.addAll(activities.stream().map(i -> i.getId()).collect(Collectors.toList()));

        activities = stravaResources.getActivityStravaApi().getRelatedActivitiesPaged(132865910, 2, 15);
        assertNotNull(activities);
        assertEquals(14, activities.size());
        activities.stream().forEach(a -> assertTrue("There should be no repeat ids. Set already contains: " + a.getId(), !set.contains(a.getId())));
    }

    @Test
    public void activitesStravaApiShouldGetActivityZones() throws Exception {
        List<ActivityZones> zones = stravaResources.getActivityStravaApi().getActivityZones(832815168);
        assertNotNull(zones);
        assertEquals(1, zones.size());
    }

    @Test
    public void activitesStravaApiShouldGetActivityLaps() throws Exception {
        List<Lap> laps = stravaResources.getActivityStravaApi().getActivityLaps(833416030);
        assertNotNull(laps);
        assertEquals(1, laps.size());
    }
}
