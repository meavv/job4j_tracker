package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] <= down || data[i] >= up) {
                result[0][i] = data[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}