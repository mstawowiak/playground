package com.github.mstawowiak.playground.numbers;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {

    public int calcPoints(String... ops) {
        Deque<Integer> points = new ArrayDeque<>();

        for (String op : ops) {
            switch (op) {
                case "+" :
                    Integer top = points.pop();
                    Integer top2Be = top + points.peek();
                    points.push(top);
                    points.push(top2Be);
                    break;
                case "D" :
                    if (points.size() > 0) {
                        int lastPoint = points.peek();
                        points.push(2 * lastPoint);
                    }
                    break;
                case "C" :
                    if (points.size() > 0) {
                        points.pop();
                    }
                    break;
                default:
                    points.push(Integer.valueOf(op));
                    break;
            }
        }

        return points.stream()
                .mapToInt(i -> i.intValue())
                .sum();
    }
}
