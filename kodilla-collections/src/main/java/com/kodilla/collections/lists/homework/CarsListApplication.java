package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import interfaces.homework.Audi;
import interfaces.homework.Car;
import interfaces.homework.Kia;
import interfaces.homework.Mazda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        /*TODO Review kdrzazga
        * Excercise says "stwórz kolekcję samochodów (typu ArrayList), której typem elementów będzie dowolna
        * KLASA implementująca interfejs Car"
        *
        * List of classes not interfaces should be used eg List<Mazda>
        * */

        cars.add(new Mazda(100));
        cars.add(new Mazda(230));
        cars.add(new Kia(190));
        cars.add(new Audi(107));

        for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(0);
        cars.remove(new Kia(190));

        System.out.println("Arrays size: " + cars.size());

        for (Car car : cars)
            CarUtils.describeCar(car);


    }
}
