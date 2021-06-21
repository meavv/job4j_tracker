package ru.job4j.set;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PangramTest {
    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(true));
    }

    @Test
    public void checkString1() {
        String str = "Jackdaws love my big sphinx of quart";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(false));
    }

    @Test
    public void checkString2() {
        String str = "Cozy sphinx waves quart jug of bad milk";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(true));
    }
}