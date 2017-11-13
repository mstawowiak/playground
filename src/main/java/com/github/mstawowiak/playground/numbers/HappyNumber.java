package com.github.mstawowiak.playground.numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings({"PMD.AvoidReassigningParameters", "PMD.AvoidLiteralsInIfCondition"})
public class HappyNumber {

    public  boolean isHappy(int number) {
        if (number < 0) {
            return false;
        }

        Set<Integer> visited = new HashSet<>();

        while (!visited.contains(number)) {
            List<Integer> digits = splitToDigits(number);
            Integer sum = sumOfSquares(digits);

            if (sum == 1) {
                return true;
            } else {
                visited.add(number);
                number = sum;
            }
        }

        return false;
    }

    private static List<Integer> splitToDigits(int number) {
        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }

    private static Integer sumOfSquares(List<Integer> digits) {
        return digits.stream()
                .mapToInt(digit -> digit * digit)
                .sum();
    }
}