package com.kodilla.abstracts.homework;

public class JobProcessor {
    public void proces(Person person, Job job) {
        System.out.println(person.getFirstName() + ", aged " + person.getAge() + ", earns " + job.getSalary() + ", is " + job.getResponsibilities());

    }
}
