package com.kodilla.collections.arrays.homework;

import interfaces.homework.Audi;
import interfaces.homework.Car;
import interfaces.homework.Kia;
import interfaces.homework.Mazda;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt(230) + 1;
        int b = random.nextInt(230) + 1;
        int c = random.nextInt(230) + 1;
        if (drawnCarKind == 0)
            return new Mazda(a);
        else if (drawnCarKind == 1)
            return new Kia(b);
        else
            return new Audi(c);
    }

}
