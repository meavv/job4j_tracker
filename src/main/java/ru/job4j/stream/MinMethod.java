package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream().min((a, b) -> Integer.compare(a.length(), b.length())).get();
    }
}
