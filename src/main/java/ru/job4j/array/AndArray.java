package ru.job4j.array;

import java.util.ArrayList;
import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int k : left) {
            for (int i : right) {
                if (k == i) {
                    list.add(k);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}