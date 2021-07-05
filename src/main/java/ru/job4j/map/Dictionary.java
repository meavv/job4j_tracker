package ru.job4j.map;

import java.util.*;

public class Dictionary {

    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            String first = String.valueOf(string.charAt(0));
            rsl.putIfAbsent(first, new ArrayList<>());
            rsl.get(first).add(string);
        }
        return rsl;
    }
}