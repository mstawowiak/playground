package com.github.mstawowiak.playground.numbers;

import java.util.Arrays;
import java.util.stream.IntStream;

@SuppressWarnings("PMD.UseVarargs")
public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        return IntStream.range(0, nums.length)
                .filter(i -> i % 2 == 0)
                .map(i -> nums[i])
                .sum();
    }
}
