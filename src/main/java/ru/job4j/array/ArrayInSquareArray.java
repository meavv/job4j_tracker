package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int x = (int) Math.sqrt(array.length) + 1;
        int count = 0;
        int[][] list = new int[x][x];
        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list.length; k++) {
                list[i][k] = array[count];
                count++;
                if (count == array.length) {
                    break;
                }
            }
        }
        return list;
    }
}