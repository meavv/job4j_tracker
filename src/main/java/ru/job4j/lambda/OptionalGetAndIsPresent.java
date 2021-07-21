package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> i = indexOf(data, el);
        if (indexOf(data, el).isEmpty()) {
            return -1;
        } else {
            return i.get();
        }
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}