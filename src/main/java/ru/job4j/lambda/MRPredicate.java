package ru.job4j.lambda;

import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate predicate() {
        return s -> s.toString().isEmpty();
    }
}