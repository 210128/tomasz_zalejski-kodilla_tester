package com.kodilla.collections.lists;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Poland("Polish"));
        countries.add(new France("French"));
        countries.add(new Germany("German"));

        for (Country country : countries) {
            System.out.print(country.getClass().getSimpleName() + "-");
            System.out.println(country.getLanguage());   // coś jeszcze miało być zrobione?
        }
    }
}
