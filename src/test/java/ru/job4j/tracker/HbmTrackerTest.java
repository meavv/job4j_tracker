package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class HbmTrackerTest {

    @Test
    public void whenFindById() {
        Item item = new Item("NAME");
        HbmTracker hbmTracker = new HbmTracker();
        hbmTracker.add(item);
        assertEquals(item, hbmTracker.findById(1));
    }

    @Test
    public void whenReplace() {
        Item item1 = new Item("1");
        Item item2 = new Item("2");
        HbmTracker hbmTracker = new HbmTracker();
        hbmTracker.add(item1);
        hbmTracker.replace(1, item2);
        assertEquals(hbmTracker.findByName("2").get(0).getName(), item2.getName());
    }

    @Test
    public void whenDelete() {
        Item item = new Item("NAME");
        HbmTracker hbmTracker = new HbmTracker();
        hbmTracker.add(item);
        assertTrue(hbmTracker.delete(1));
    }

    @Test
    public void whenFindAll() {
        Item item1 = new Item("1");
        Item item2 = new Item("2");
        HbmTracker hbmTracker = new HbmTracker();
        hbmTracker.add(item1);
        hbmTracker.add(item2);
        assertEquals(hbmTracker.findAll().get(0), item1);
        assertEquals(hbmTracker.findAll().get(1), item2);
    }

}