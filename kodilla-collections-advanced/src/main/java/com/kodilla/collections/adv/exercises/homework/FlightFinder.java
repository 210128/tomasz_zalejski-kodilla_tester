package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> results = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {/*TODO Review: When getFlightsTable() is made non-static, use lazy creation
        new FlightRepository().getFlightsTable()/*/
            if (flight.getDeparture().equals(departure))
                results.add(flight);
        }
        return results;
    }

    public List<Flight> findFlightsTo(String arrival) {
        ArrayList<Flight> results = new ArrayList<>();
        FlightRepository flightRepository = new FlightRepository();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                results.add(flight);
        }
        return results;
    }
}