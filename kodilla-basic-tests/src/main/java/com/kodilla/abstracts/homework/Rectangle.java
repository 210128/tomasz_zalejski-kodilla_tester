package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    final double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return getSideA() * sideB;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (getSideA() + sideB);
    }
}
