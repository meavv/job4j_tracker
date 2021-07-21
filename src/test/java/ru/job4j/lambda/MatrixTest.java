package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void mtrx1() {
        Integer[][] m = {{1, 2}, {3, 4}};
        List<Integer> excepted = List.of(1, 2, 3, 4);
        assertThat(Matrix.mtrx(m), is(excepted));
    }

    @Test
    public void mtrx2() {
        Integer[][] m = {{1, 2, 3}, {3, 4, 3}};
        List<Integer> excepted = List.of(1, 2, 3, 3, 4, 3);
        assertThat(Matrix.mtrx(m), is(excepted));
    }
}