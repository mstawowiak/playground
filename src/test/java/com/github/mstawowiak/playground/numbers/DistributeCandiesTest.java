package com.github.mstawowiak.playground.numbers;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for {@link DistributeCandies}
 */
public class DistributeCandiesTest {

    private static DistributeCandies dc;

    @BeforeClass
    public static void beforeClass() {
        dc = new DistributeCandies();
    }

    @Test
    public void testDistributeCandies() {
        int[] candies1 = {1,1,2,2,3,3};
        int[] candies2 = {1,1,2,3};
        int[] candies3 = {1,1,1,1,1,1,1,1,1,1,2,3};
        int[] candies4 = {-1,0,1,2,3,4,5,6,7,8,9,10};

        Assert.assertEquals(3, dc.distributeCandies(candies1));
        Assert.assertEquals(2, dc.distributeCandies(candies2));
        Assert.assertEquals(3, dc.distributeCandies(candies3));
        Assert.assertEquals(6, dc.distributeCandies(candies4));
    }
}
