package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int count = 0;
        for (int datum : data) {
            if (datum % 2 != 0) {
                count++;
            }
        }
        int[] list = new int[count];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                list[j] = data[i];
                j++;
            }
        }
        return list;
    }
}