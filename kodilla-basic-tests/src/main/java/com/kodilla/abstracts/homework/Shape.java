package com.kodilla.abstracts.homework;

public abstract class Shape {
    private final double sideA;


    public Shape(double sideA) {
        this.sideA = sideA;

    }

    public abstract double calculateArea();

    public abstract double calculateCircumference();

    public double getSideA() {
        return sideA;
    }
}
