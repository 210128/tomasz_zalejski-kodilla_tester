package com.kodilla.abstracts.homework;

public class Accountant extends Job {


    public Accountant(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayResponsibilities() {
        System.out.println(getResponsibilities());
    }


}
