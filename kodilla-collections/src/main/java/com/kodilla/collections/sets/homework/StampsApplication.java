package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Fauna: Honeybee", "No", 250, 200));
        stamps.add(new Stamp("Fauna: Wood ant", "Yes", 250, 200));
        stamps.add(new Stamp("Fauna: European cat", "Yes", 150, 300));
        stamps.add(new Stamp("Fauna: Siamese cat", "No", 150, 300));
        stamps.add(new Stamp("Cities: Wilno", "Yes", 200, 300));
        stamps.add(new Stamp("Cities: Warsaw", "No", 200, 300));
        stamps.add(new Stamp("Cities: Lublin", "No", 200, 300));
        stamps.add(new Stamp("Fauna: Wood ant", "Yes", 250, 200));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
