package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OddPrintTest {

    @Test
    public void whenNonEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[]{1, 2, 3, 4});
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "4" + ln
                        + "2" + ln
        ));
    }

    @Test
    public void whenEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[]{1, 3, 5});
        assertThat(out.toString(), is(""));
    }

}