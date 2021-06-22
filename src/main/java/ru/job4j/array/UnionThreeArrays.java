package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int x = 2 + (((middle.length + right.length) - 1)/2);
        int[] array = new int[x];
        array[0] = left[0];
        array[array.length-1] = left[left.length-1];
        int j = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                if (j % 2 != 0) {
                    array[i] = middle[j];
                }
            }
            if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        array[i] = right[j];
                    }

            }
            j++;
        }


        return array;
    }
}