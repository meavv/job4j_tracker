package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StudentToMapTest {

    @Test
    public void toMapTest() {
        Student student1 = new Student(10, "A");
        Student student11 = new Student(10, "A");
        Student student2 = new Student(11, "B");
        Student student3 = new Student(12, "C");
        Student student4 = new Student(13, "D");
        List <Student> list = List.of(student1,student2,student3,student4,student11);
        Map <String, Student> excepted = new HashMap<>();
        excepted.put(student1.getSurname(), student1);
        excepted.put(student2.getSurname(), student2);
        excepted.put(student3.getSurname(), student3);
        excepted.put(student4.getSurname(), student4);
        assertThat(StudentToMap.toMap(list), is(excepted));
    }
}