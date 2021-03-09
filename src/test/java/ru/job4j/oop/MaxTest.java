package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void testMax() {
        int result = Max.max(1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void testTestMax() {
        int result = Max.max(1, 4, 6);
        assertThat(result, is(6));
    }

    @Test
    public void testTestMax1() {
        int result = Max.max(1, 4, 6, 9);
        assertThat(result, is(9));
    }
}