package ru.job4j.array;

import java.util.Arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        for (int[] ints : array) {
            count += ints.length;
        }
        int y = (int) Math.ceil(Math.sqrt(count));
        int[] temp = new int[count];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[x] = array[i][j];
                x++;
            }
        }
        int[][] list = new int[y][y];
        x = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (x < count) {
                    list[i][j] = temp[x];
                    x++;
                }
            }
        }
        return list;
    }
}