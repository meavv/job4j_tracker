package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(a -> a.startsWith("A"))
                .filter(a -> a.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
