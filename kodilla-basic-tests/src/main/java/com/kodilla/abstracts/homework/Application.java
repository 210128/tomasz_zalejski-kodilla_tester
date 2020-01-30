package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(4);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square circumference: " + square.calculateCircumference());

        Shape rectangle = new Rectangle(3, 8);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());

        Shape triangle = new RectangularTriangle(3, 4, 8);
        System.out.println("Rectangular triangle Circumference: " + triangle.calculateCircumference());

        ShapeProcessor processor = new ShapeProcessor();
        processor.process(square);

    }
}
