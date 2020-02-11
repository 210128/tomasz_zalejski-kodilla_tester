package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        FlightRepository flightRepository = new FlightRepository();
        ArrayList<Flight> results = new ArrayList<>();
        for (Flight flight : flightRepository.getFlightsTable())
            if (departure.equals(flight))
                results.add(flight);
        return results;
    }

    public List<Flight> findFlightsTo(String arrival) {
        ArrayList<Flight> results = new ArrayList<>();
        FlightRepository flightRepository = new FlightRepository();
        for (int i = 0; i < flightRepository.getFlightsTable().size(); i++) {
            if (flightRepository.getFlightsTable().contains(arrival))
                results.add((Flight) flightRepository.getFlightsTable());
        }
        return results;
    }
}
