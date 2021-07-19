package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {

    @Test
    public void collect() {
        Address address1 = new Address("Москва", "Улица1", 10, 407);
        Profile profile1 = new Profile(address1);
        Address address2 = new Address("Ижевск", "Улица3", 12, 600);
        Profile profile2 = new Profile(address2);
        Address address3 = new Address("Пермь", "Улица2", 11, 500);
        Profile profile3 = new Profile(address3);
        List<Profile> profiles = List.of(profile1, profile2, profile3);
        Profiles pr = new Profiles();
        List<Address> list = pr.collect(profiles);
        List<Address> excepted = new ArrayList<>();
        excepted.add(address1);
        excepted.add(address2);
        excepted.add(address3);
        assertThat(list, is(excepted));
    }
}