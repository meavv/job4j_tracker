package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1 - i] % 2 == 0) {
                System.out.println(array[array.length - 1 - i]);
            }
        }
    }
}