package com.github.mstawowiak.playground.strings;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link TinyUrl}
 */
public class TinyUrlTest {

    @Test
    public void shouldStartsWithTinyUrl() {
        String url = "https://leetcode.com/problems/design-tinyurl";

        TinyUrl codec = new TinyUrl();
        String tinyUrl = codec.encode(url);

        Assert.assertTrue(tinyUrl.startsWith("http://tinyurl.com/"));
    }

    @Test
    public void shouldCorrectEncodeAndDecode() {
        String url = "https://leetcode.com/problems/design-tinyurl";

        TinyUrl codec = new TinyUrl();

        String tinyUrl = codec.encode(url);
        String longUrl = codec.decode(tinyUrl);

        Assert.assertEquals(url, longUrl);
    }

    @Test
    public void shouldCorrectEncodeAndDecodeForManyUrls() {
        String urlBase = "https://leetcode.com/problems/design-tinyurl/";
        int numOfTests = 100_000;

        TinyUrl codec = new TinyUrl();

        List<String> tinyUrls = new ArrayList<>();
        for (int i = 0; i < numOfTests; i++) {
            tinyUrls.add(codec.encode(urlBase + i));
        }

        for (int i = 0; i < numOfTests; i++) {
            String expected = urlBase + i;
            String longUrl = codec.decode(tinyUrls.get(i));
            Assert.assertEquals(expected, longUrl);
        }
    }
}
