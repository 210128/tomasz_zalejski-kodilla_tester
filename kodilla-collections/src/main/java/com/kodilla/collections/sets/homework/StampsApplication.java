package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Fauna: Honeybee", false, 250, 200));
        stamps.add(new Stamp("Fauna: Wood ant", true, 250, 200));
        stamps.add(new Stamp("Fauna: European cat", true, 150, 300));
        stamps.add(new Stamp("Fauna: Siamese cat", false, 150, 300));
        stamps.add(new Stamp("Cities: Wilno", true, 200, 300));
        stamps.add(new Stamp("Cities: Warsaw", false, 200, 300));
        stamps.add(new Stamp("Cities: Lublin", false, 200, 300));
        stamps.add(new Stamp("Fauna: Wood ant", true, 250, 200));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
