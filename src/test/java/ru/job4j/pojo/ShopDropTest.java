package ru.job4j.pojo;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast1() {
        Product[] products = new Product[4];
        products[0] = new Product("A", 10);
        products[1] = new Product("B", 4);
        products[2] = new Product("C", 4);
        products[3] = new Product("D", 4);
        Product[] rsl = ShopDrop.leftShift(products, 2);
        assertThat(rsl[0].getName(), is("A"));
        assertThat(rsl[1].getName(), is("B"));
        assertThat(rsl[2].getName(), is("D"));
        assertThat(rsl[3], is(nullValue()));
    }
}