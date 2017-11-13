package com.github.mstawowiak.playground.numbers;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for {@link HappyNumber}
 */
public class HappyNumberTest {

    private static HappyNumber happyNumber;

    @BeforeClass
    public static void beforeClass() {
        happyNumber = new HappyNumber();
    }

    @Test
    public void testHappyNumber() {
        assertTrue(happyNumber.isHappy(1));
        assertTrue(happyNumber.isHappy(7));
        assertTrue(happyNumber.isHappy(10));
        assertTrue(happyNumber.isHappy(19));
        assertTrue(happyNumber.isHappy(100));
    }

    @Test
    public void testNotHappyNumber() {
        assertFalse(happyNumber.isHappy(-1));
        assertFalse(happyNumber.isHappy(0));
        assertFalse(happyNumber.isHappy(2));
        assertFalse(happyNumber.isHappy(3));
        assertFalse(happyNumber.isHappy(4));
        assertFalse(happyNumber.isHappy(5));
        assertFalse(happyNumber.isHappy(6));
        assertFalse(happyNumber.isHappy(126549));
    }
}
