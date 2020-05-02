package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    public static Predicate<Student> moreThan70() {
        return p -> p.getScore() >= 70;
    }

    public static Predicate<Student> from50To69() {
        return p -> p.getScore() >= 50 && p.getScore() < 70;
    }

    public static Predicate<Student> from0To49() {
        return p -> p.getScore() >= 0 && p.getScore() < 50;
    }
}
