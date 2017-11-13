package com.github.mstawowiak.playground.numbers;

import java.util.Arrays;
import java.util.stream.Collectors;

@SuppressWarnings("PMD.UseVarargs")
public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        int candiesPerChild = candies.length / 2;
        int kinds = countKinds(candies);

        return Math.min(candiesPerChild, kinds);
    }

    private static int countKinds(int[] candies) {
        return Arrays.stream(candies)
                .boxed()
                .collect(Collectors.toSet())
                .size();
    }
}
