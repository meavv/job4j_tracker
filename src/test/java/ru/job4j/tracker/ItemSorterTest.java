package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class ItemSorterTest {

    @Test
    public void sort() {
        List<Item> items = Arrays.asList(
                new Item("a"),
                new Item("z"),
                new Item("b")
        );
        List<Item> excepted = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("z")
        );
        items = ItemSorter.sort(items);
        assertThat(items, is(excepted));
    }

    @Test
    public void reverse() {
        List<Item> items = Arrays.asList(
                new Item("a"),
                new Item("z"),
                new Item("b")
        );
        List<Item> excepted = Arrays.asList(
                new Item("z"),
                new Item("b"),
                new Item("a")
        );
        items = ItemSorter.reverse(items);
        assertThat(items, is(excepted));
    }

}