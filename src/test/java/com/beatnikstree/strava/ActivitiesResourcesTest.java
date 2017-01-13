package com.beatnikstree.strava;

import com.beatnikstree.strava.data.*;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
    public void athleteStravaApiShouldGetCurrentAthlete() throws Exception {
        Activity activity = stravaResources.getActivitiesStravaApi().getActivity(829679899L);
        assertNotNull(activity);
    }

}
