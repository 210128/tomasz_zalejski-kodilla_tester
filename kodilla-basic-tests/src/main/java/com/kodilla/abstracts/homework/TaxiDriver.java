package com.kodilla.abstracts.homework;

public class TaxiDriver extends Job {


    public TaxiDriver(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void displayResponsibilities() {
        System.out.println(getResponsibilities());
    }//TODO: review kdrzazga Pls move to super class


}
