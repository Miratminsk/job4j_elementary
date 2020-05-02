package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void whenFrom0To49() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(13));
        students.add(new Student(71));
        students.add(new Student(69));
        students.add(new Student(100));
        students.add(new Student(55));
        students.add(new Student(49));
        List<Student> expect = new ArrayList<>();
        expect.add(new Student(13));
        expect.add(new Student(49));
        School school = new School();
        List<Student> studentList = school.collect(students, School.from0To49());
        studentList.forEach(System.out::println);
        assertEquals(studentList.toString(), expect.toString());
    }

    @Test
    public void whenFrom50To69() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(13));
        students.add(new Student(71));
        students.add(new Student(69));
        students.add(new Student(100));
        students.add(new Student(55));
        students.add(new Student(49));
        List<Student> expect = new ArrayList<>();
        expect.add(new Student(69));
        expect.add(new Student(55));
        School school = new School();
        List<Student> studentList = school.collect(students, School.from50To69());
        studentList.forEach(System.out::println);
        assertEquals(studentList.toString(), expect.toString());
    }

    @Test
    public void whenMoreThan70() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(13));
        students.add(new Student(71));
        students.add(new Student(69));
        students.add(new Student(100));
        students.add(new Student(55));
        students.add(new Student(49));
        List<Student> expect = new ArrayList<>();
        expect.add(new Student(71));
        expect.add(new Student(100));
        School school = new School();
        List<Student> studentList = school.collect(students, School.moreThan70());
        studentList.forEach(System.out::println);
        assertEquals(studentList.toString(), expect.toString());
    }
}