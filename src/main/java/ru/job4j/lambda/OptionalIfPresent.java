package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        if (max(data).isEmpty()) {
            System.out.print("");
        }
        max(data).ifPresent(x -> System.out.println("Max: " + max(data).get()));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        } else {
            int max = data[0];
            for (int i = 1; i < data.length; i++) {
                max = Math.max(data[i], max);
            }
            return Optional.of(max);
        }
    }
}