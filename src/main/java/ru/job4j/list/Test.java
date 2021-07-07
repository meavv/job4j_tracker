package ru.job4j.list;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String s = "java";
        String[] words = s.split("", 0);
        Arrays.sort(words);
        System.out.println(builder.append(words));

    }
}
