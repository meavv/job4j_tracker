package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int t;
        for (int i = 0; i < rsl.length; i++) {
            if (i < left.length) {
                rsl[i] = left[i];
            } else {
                rsl[i] = right[i - left.length];
            }
        }
        for (int i = 0; i < rsl.length; i++) {
            for (int j = i + 1; j < rsl.length; j++) {
                if (rsl[j] < rsl[i]) {
                    t = rsl[i];
                    rsl[i] = rsl[j];
                    rsl[j] = t;
                }
            }
        }
        return rsl;
    }
}
