package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FuncTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Func.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunction() {
        List<Double> result = Func.diapason(5, 8, x -> 2 * (x * x) + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction() {
        List<Double> result = Func.diapason(5, 8, x -> 2 * (Math.pow(3, x)) + 1);
        List<Double> expected = Arrays.asList(487D, 1459D, 4375D);
        assertThat(result, is(expected));
    }
}