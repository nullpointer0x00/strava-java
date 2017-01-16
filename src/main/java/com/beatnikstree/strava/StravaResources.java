package com.beatnikstree.strava;

/**
 * Created by nullpointer0x00 on 12/28/16.
 */
public class StravaResources {

    final String accessToken;

    private AthleteStravaApi athleteStravaApi;
    private ActivityStravaApi activityStravaApi;

    public StravaResources(String accessToken){
        this.accessToken = accessToken;
    }

    public AthleteStravaApi getAthleteStravaApi(){
        if(athleteStravaApi == null){
            athleteStravaApi = new AthleteStravaApi(accessToken);
        }
        return athleteStravaApi;
    }

    public ActivityStravaApi getActivityStravaApi(){
        if(activityStravaApi == null){
            activityStravaApi = new ActivityStravaApi(accessToken);
        }
        return activityStravaApi;
    }

}
