package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] list = new int[3];
        int x = 2;
        for (int i = 0; i < data.length; i++) {
            list[i] = data[i][2 - i];

        }
        return list;
    }
}