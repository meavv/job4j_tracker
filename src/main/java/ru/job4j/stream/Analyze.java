package ru.job4j.stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.map(Pupil::getSubjects)
                .flatMap(Collection::stream)
                .mapToInt(Subject::getScore)
                .average()
                .orElse('0');
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(a -> new Tuple(a.getName(), a.getSubjects().stream()
                .mapToDouble(Subject::getScore).average().orElse('0')))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(a -> a.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream().map(
                        s -> new Tuple(s.getKey(), s.getValue()))
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(a -> new Tuple(a.getName(), a.getSubjects().stream()
                .mapToDouble(Subject::getScore).sum()))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(a -> a.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName,
                        Collectors.summarizingDouble(Subject::getScore)))
                .entrySet().stream().map(
                        s -> new Tuple(s.getKey(), s.getValue().getSum()))
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }
}