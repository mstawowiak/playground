package com.github.mstawowiak.playground.numbers;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for {@link ArrayPartition}
 */
public class ArrayPartitionTest {

    private static ArrayPartition arrayPartition;

    @BeforeClass
    public static void beforeClass() {
        arrayPartition = new ArrayPartition();
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        Assert.assertEquals(0, arrayPartition.arrayPairSum(input));
    }

    @Test
    public void testArrayPairSum() {
        int[] input1 = {1, 4, 3, 2};
        Assert.assertEquals(4, arrayPartition.arrayPairSum(input1));

        int[] input2 = {105, 101, 104, 103, 100, 100};
        Assert.assertEquals(305, arrayPartition.arrayPairSum(input2));

        int[] input3 = {-100, 100, -50, 50, -25, 25};
        Assert.assertEquals(-75, arrayPartition.arrayPairSum(input3));
    }
}
