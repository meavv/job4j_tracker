package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void add1() {
        Citizen citizen = new Citizen("123456", "Qwerty");
        Citizen citizen1 = new Citizen("123456", "Qqq");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        boolean x = office.add(citizen1);
        assertThat(x, is(false));
    }
}