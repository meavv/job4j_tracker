package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void testDistance() {
        Point a = new Point(7, 10);
        Point b = new Point(9, 7);

        double excepted = 3.60;
        double rsl = a.distance(b);
        Assert.assertEquals(excepted, rsl, 0.01);

    }
}