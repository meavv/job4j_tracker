package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int x = 0;
        int count = 0;
        int count1 = 0;
        for (int[] datum : data) {
            x += datum.length;
        }
        int[] list = new int[x];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                    count1++;
                } else {
                    list[count] = data[i][j];
                    count++;
                }
            }
        }
        list = Arrays.copyOf(list, x - count1);
        return list;
    }
}