package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> optional = Optional.empty();
        if (strings.contains(value)) {
            optional = Optional.of(value);
        }
        return optional;
    }
}