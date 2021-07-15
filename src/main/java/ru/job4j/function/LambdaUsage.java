package ru.job4j.function;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] strings = {
                "AAAA",
                "xxx",
                "bb",
                "z"
        };
        Comparator<String> cmpText = (a, b) -> {
            System.out.println("Compare to  " + a + b);
            return  a.compareTo(b);
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("Compare " + left.length() + right.length());
            return right.length() - left.length();
        };
    }
}