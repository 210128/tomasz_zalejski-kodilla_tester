package com.kodilla.abstracts.homework;

public class RectangularTriangle extends Shape {
    double sideB;
    double sideC;

    public RectangularTriangle(double sideA, double sideB, double sideC) {
        super(sideA);
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return (getSideA() * sideB) / 2;
    }

    @Override
    public double calculateCircumference() {
        return getSideA() + sideB + sideC;
    }
}
