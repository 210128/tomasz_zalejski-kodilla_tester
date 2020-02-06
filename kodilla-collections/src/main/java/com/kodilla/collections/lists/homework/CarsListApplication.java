package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import interfaces.homework.Car;
import interfaces.homework.Mazda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Mazda> cars = new ArrayList<>();  /* to jest często problem..., załapać co mam zrobić, jak już wiem co, lub
        mi się wydaje że wiem o co chodzi to dalej już leci... */

        cars.add(new Mazda(100));
        cars.add(new Mazda(230));
        cars.add(new Mazda(190));
        cars.add(new Mazda(107));

        for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(0);
        cars.remove(new Mazda(190));
        System.out.println();
        System.out.println("Arrays size: " + cars.size());

        for (Car car : cars)
            CarUtils.describeCar(car);


    }
}
