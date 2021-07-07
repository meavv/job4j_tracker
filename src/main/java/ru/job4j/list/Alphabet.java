package ru.job4j.list;

import java.util.Arrays;

public class Alphabet {
    public static String reformat(String s) {
        StringBuilder builder = new StringBuilder();
        String[] words = s.split("", 0);
        Arrays.sort(words);
        for (String ss : words) {
            builder.append(ss);
        }
        String str = builder.toString();
        return str;
    }
}