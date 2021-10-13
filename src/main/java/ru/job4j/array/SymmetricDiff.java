package ru.job4j.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : left) {
            list.add(j);
        }
        for (int k : right) {
            if (!list.contains(k)) {
                list.add(k);
            } else {
                list.remove(k - 1);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}