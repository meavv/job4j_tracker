package ru.job4j.lambda;

import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class MRSupplierTest {

    @Test
    public void test() {
        Supplier supplier = MRSupplier.supplier();
        assertEquals("", supplier.get());
    }

}