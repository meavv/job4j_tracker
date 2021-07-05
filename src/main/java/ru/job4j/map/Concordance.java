package ru.job4j.map;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        s = s.replaceAll("\\s+", "");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            rsl.putIfAbsent(chars[i], new ArrayList<>());
            rsl.get(chars[i]).add(i);
        }
        return rsl;
    }
}