package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom(){
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
expectedList.add(new Flight("Warsaw", "Gdańsk"));
expectedList.add(new Flight("Warsaw","Berlin"));
assertEquals(expectedList, result);

    }

}