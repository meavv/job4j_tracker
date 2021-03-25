package ru.job4j.ex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenIllegalArgumentException() {
        Fact fact = new Fact();
        fact.calc(-2);
    }

    @Test
    public void when3() {
        Fact fact = new Fact();
        assertThat(fact.calc(3),is(6));
    }
}