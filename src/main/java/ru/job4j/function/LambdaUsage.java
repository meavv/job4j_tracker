package ru.job4j.function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] strings = {
                "AAAA",
                "xxx",
                "bb",
                "z"
        };
        Comparator <String> cmpText = (a, b) -> a.compareTo(b);
        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();
        Arrays.sort(strings, cmpDescSize);
        System.out.println("Сортировка по размеру: " + Arrays.toString(strings));
        Arrays.sort(strings, cmpText);
        System.out.println("Сортировка compareTo: " +Arrays.toString(strings));
    }
}