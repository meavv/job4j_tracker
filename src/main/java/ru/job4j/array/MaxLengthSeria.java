package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int rsl = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i+1]) {
                rsl += 1;

            }
            if (array[i] > array[i+1]) {
                rsl = 1;
            }
        }
        return rsl;
    }
}
