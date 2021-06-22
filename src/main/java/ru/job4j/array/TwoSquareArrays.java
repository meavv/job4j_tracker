package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] list = new int[left.length * left[0].length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (left[i][j] > right[i][j]) {
                    list[count] = left[i][j];
                }
                if (left[i][j] < right[i][j]) {
                    list[count] = right[i][j];
                }
                count++;
            }
        }
        return list;
    }
}