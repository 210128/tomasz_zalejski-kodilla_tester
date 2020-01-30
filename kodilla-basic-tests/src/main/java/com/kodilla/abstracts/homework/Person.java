package com.kodilla.abstracts.homework;

public class Person {
    final String firstName;
    final int age;
    final Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void displayDutiesOfPersonAtWork() {
        System.out.print(job.getClass().getSimpleName() + " ");
        job.displayResponsibilities();
        System.out.println();
    }

    public static void main(String[] args) {

        Job javaDeveloper = new JavaDeveloper(5500, "responsible for designing solutions and creating software and technical documentation.");
        Person bob = new Person("Bob", 26, javaDeveloper);
        bob.displayDutiesOfPersonAtWork();

        Job taxiDriver = new TaxiDriver(2000, "responsible for safe transport of transported people and their hand luggage");
        Person mark = new Person("Mark", 45, taxiDriver);
        mark.displayDutiesOfPersonAtWork();

        Job accountant = new Accountant(5000, "responsible for keeping accounting books based on accounting documents, in a manner consistent with the Act");
        Person anna = new Person("Anna", 50, accountant);
        anna.displayDutiesOfPersonAtWork();

        JobProcessor processor = new JobProcessor();
        processor.proces(bob, javaDeveloper);
        processor.proces(mark, taxiDriver);
        processor.proces(anna, accountant);
    }
}
