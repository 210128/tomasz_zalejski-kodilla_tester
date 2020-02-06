package com.kodilla.collections.lists;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Country> countries = List.of(new Country("Poland"), new Country("Germany"), new Country("France"));
        for (Country country: countries) {
            System.out.println(country.getClass().getSimpleName());

        }
    }
}
