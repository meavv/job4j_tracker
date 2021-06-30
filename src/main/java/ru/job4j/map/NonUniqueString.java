package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> maps = new HashMap<String, Boolean> ();
        for (String str : strings) {
            maps.computeIfPresent(str, (key, value) -> value = true);
            maps.putIfAbsent(str, false);
        }
        return maps;
    }
}