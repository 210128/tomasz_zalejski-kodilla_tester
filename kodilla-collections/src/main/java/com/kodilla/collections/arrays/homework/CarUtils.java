package com.kodilla.collections.arrays.homework;

import interfaces.homework.Audi;
import interfaces.homework.Car;
import interfaces.homework.Kia;
import interfaces.homework.Mazda;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("________________");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());


    }
    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Mazda)
            return "Mazda";
        else
            return "Unknown car name";
    }
}
