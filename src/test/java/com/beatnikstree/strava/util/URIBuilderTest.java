package com.beatnikstree.strava.util;

import com.beatnikstree.strava.util.URIBuilder;

import org.junit.Test;
import static org.junit.Assert.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nullpointer0x00 on 12/23/16.
 */
public class URIBuilderTest {

    @Test
    public void buildUriWithParameters(){
        Map<String, String> params = new HashMap<>();
        params.put("param1", "val1");
        URI uri = URIBuilder.fromUri("http://test.com/test").queryParams(params).build();
        assertEquals("http://test.com/test?param1=val1", uri.toString());
        params.put("param2", "val2");
        uri = URIBuilder.fromUri("http://test.com/test").queryParams(params).build();
        assertEquals("http://test.com/test?param1=val1&param2=val2", uri.toString());
    }
}
