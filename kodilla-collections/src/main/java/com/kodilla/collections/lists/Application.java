package com.kodilla.collections.lists;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Country> countries = List.of(new Poland("Polish"), new France("French"), new Germany("German"));

        for (Country country : countries) {
            System.out.print(country.getClass().getSimpleName() + "-");
            System.out.println(country.getLanguage());   // coś jeszcze miało być zrobione?
        }
    }
}
