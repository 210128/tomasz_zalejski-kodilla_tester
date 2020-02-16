package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", new Teacher("Keanu Reeves")));
        students.add(new Student("Al Bundy", new Teacher("Peggy Bundy")));
        students.add(new Student("Brad Pitt", null));
        students.add(new Student("Bart Simpson", new Teacher("John Stevenson")));
        students.add(null);

        for (Student student : students) {
            System.out.println("Student: " + getStudentName(student) + ", teacher: " + getTeacherName(student));
        }
    }

    private static String getTeacherName(Student student) {
        return Optional.ofNullable(student)
                .map(s -> student.getTeacher())
                .map(teacher -> teacher.getName())
                .orElse("<undefined>");

    }

    private static String getStudentName(Student student) {
        return Optional.ofNullable(student)
                .map(s -> student.getName())
                .orElse("<undefined>");
    }
}
