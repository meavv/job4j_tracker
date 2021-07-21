package ru.job4j.lambda;

import java.util.function.Supplier;

public class MRSupplier {
    public static Supplier supplier() {
        return () -> new String("");
    }
}