package com.kodilla.abstracts.homework;

public class JavaDeveloper extends Job {

    public JavaDeveloper(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayResponsibilities() {
        System.out.println(getResponsibilities());//TODO: review kdrzazga Pls move to super class
    }



}
