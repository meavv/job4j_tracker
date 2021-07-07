package ru.job4j.list;

import java.util.Iterator;
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        boolean rsl = true;
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                rsl = false;
                break;
            }
        }
        if (rsl) {
            for (Integer datum : data) {
                sum += datum;
            }
        }
        return sum;
    }
}