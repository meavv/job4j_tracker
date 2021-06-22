package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[9];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[count] = data[i][j];
                count++;
            }
        }
        return array;
    }
}