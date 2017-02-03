package com.beatnikstree.strava;

import com.beatnikstree.strava.data.Athlete;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Connection}
 *
 * Created by nullpointer0x00 on 12/28/16.
 */
public class ConnectionTest {

    @Test
    public void testConnection() {
        Connection connection = new Connection("someapi-key");
        StravaResources resources = connection.getApi();
        AthleteStravaApi athleteStravaApi = resources.getAthleteStravaApi();
        assertNotNull(athleteStravaApi);

    }
}
