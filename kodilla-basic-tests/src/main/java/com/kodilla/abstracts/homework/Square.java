package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double sideA) {
        super(sideA);

    }

    @Override
    public double calculateArea() {
        return getSideA() * 2;
    }

    @Override
    public double calculateCircumference() {
        return getSideA() * 4;
    }
}
