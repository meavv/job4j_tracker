package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentToMap {
    public static Map<String, Student> toMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        a -> a,
                        (o1, o2) -> o1
                ));
    }
}