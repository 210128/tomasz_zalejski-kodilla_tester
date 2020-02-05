package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudentsInClass = new ArrayList<>();

    public School(int... numberOfStudentsInClass) {
        for (int schoolClas : numberOfStudentsInClass)
            this.numberOfStudentsInClass.add(schoolClas);
    }

    public int getNumberOfStudents() {
        int sum = 0;
        for (int sumOfStudents : numberOfStudentsInClass)
            sum += sumOfStudents;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudentsInClass=" + numberOfStudentsInClass +
                '}';
    }
}
