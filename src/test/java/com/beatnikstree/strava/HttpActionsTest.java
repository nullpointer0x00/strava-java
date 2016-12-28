package com.beatnikstree.strava;

import com.beatnikstree.strava.HttpActions;
import org.junit.Test;

import java.net.URI;

/**
 * Created by nullpointer0x00 on 12/16/16.
 */
public class HttpActionsTest {


    @Test
    public void httpActionsDoGet() throws  Exception{
        HttpActions httpActions = new HttpActions();
        URI uri = new URI("http://www.google.com");

        String response = httpActions.doExecute(uri, "GET");
        System.out.println(response);
    }

    @Test
    public void httpActionsDoPost() throws Exception {
        HttpActions httpActions = new HttpActions();
        URI uri = new URI("http://www.google.com");
        String response = httpActions.doExecute(uri, "POST");
        System.out.println(response);
    }
}
