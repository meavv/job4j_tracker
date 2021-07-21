package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public static List<Integer> mtrx(Integer[][] i) {
        return Arrays.stream(i)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
