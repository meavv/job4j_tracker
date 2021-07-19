package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> findName = s -> s.getName().contains(key);
        Predicate<Person> findSurname = s -> s.getSurname().contains(key);
        Predicate<Person> findPhone = s -> s.getPhone().contains(key);
        Predicate<Person> findAddress = s -> s.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> combine = findName.or(findSurname).or(findPhone).or(findAddress);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}