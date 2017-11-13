package com.github.mstawowiak.playground.numbers;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for {@link BaseballGame}
 */
public class BaseballGameTest {

    private static BaseballGame game;

    @BeforeClass
    public static void beforeClass() {
        game = new BaseballGame();
    }

    @Test
    public void testEmptyPointsTable() {
        String[] points = {};
        Assert.assertEquals(0, game.calcPoints(points));
    }

    @Test
    public void testCalculcatePoints() {
        String[] points1 = {"5","2","C","D","+"};
        String[] points2 = {"5","-2","4","C","D","9","+","+"};

        Assert.assertEquals(30, game.calcPoints(points1));
        Assert.assertEquals(27, game.calcPoints(points2));
    }
}
