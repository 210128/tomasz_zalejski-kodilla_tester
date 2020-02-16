package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {/*TODO: Review : pls remove static, non-clean solution*/
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Gdańsk"));
        flights.add(new Flight("Berlin", "Kraków"));
        flights.add(new Flight("Paris", "Tokio"));
        flights.add(new Flight("Berlin", "Madrid"));
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Madrid", "Warsaw"));
        return flights;
    }

    public int size() {
        return FlightRepository.getFlightsTable().size();
    }
}
