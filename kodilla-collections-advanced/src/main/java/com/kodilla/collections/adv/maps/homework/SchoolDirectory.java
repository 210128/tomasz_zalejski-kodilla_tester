package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal al = new Principal("Al", "Bundy");
        Principal john = new Principal("John", "Smith");
        Principal alexis = new Principal("Alexis", "Blake");
        Principal stephen = new Principal("Stephen", "King");

        School alSchool = new School(12, 19, 20, 25, 17, 30, 27);
        School johnSchool = new School(13, 10, 16, 18, 20, 23, 28, 33);
        School alexisSchool = new School(8, 5, 11, 7, 7, 9, 10);
        School stephenSchool = new School(19, 19, 20, 23, 24, 25);

        school.put(al, alSchool);
        school.put(john, johnSchool);
        school.put(alexis, alexisSchool);
        school.put(stephen, stephenSchool);

        for(Map.Entry<Principal, School> principalSchoolEntry : school.entrySet())
            System.out.println("Principal "+principalSchoolEntry.getKey().getFirstName() + " "+principalSchoolEntry.getKey().getLastName()+" -  number of students at school - " + principalSchoolEntry.getValue().getNumberOfStudents());
    }
}
