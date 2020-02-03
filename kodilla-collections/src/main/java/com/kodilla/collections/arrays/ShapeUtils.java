package com.kodilla.collections.arrays;

import interfaces.Circle;
import interfaces.Shape;
import interfaces.Square;
import interfaces.Triangle;

public class ShapeUtils {

    public static void displayShapeInfo(Shape shape) {
        System.out.println("_______________________");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }

    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Square)
            return "Square";
        else if (shape instanceof Triangle)
            return "Triangle";
        else
            return "Unknown shape name";
    }
}
