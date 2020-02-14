package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", new Teacher("Keanu Reeves")));
        students.add(new Student("Al Bundy", new Teacher("Peggy Bundy")));
        students.add(new Student("Brad Pitt", null));
        students.add(new Student("Bart Simpson", new Teacher("John Stevenson")));

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
