package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[src].length; i++) {
            int temp = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp;
        }
    }
}