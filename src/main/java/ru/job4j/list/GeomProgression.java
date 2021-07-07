package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        list.add(first);
        for (int i = 1; i < count; i++) {
            list.add((int) (first * (Math.pow(denominator, i))));
        }
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}