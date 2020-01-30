package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public void process(Shape shape) {
        System.out.println("The surface area of the shape is " + shape.calculateArea() + " and the circumference is " + shape.calculateCircumference());
    }

}

