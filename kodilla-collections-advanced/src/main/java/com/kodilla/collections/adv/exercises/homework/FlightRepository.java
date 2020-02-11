package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static ArrayList<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        flights.add(new Flight("Warsaw", "Gdańsk"));
        flights.add(new Flight("Berlin", "Kraków"));
        flights.add(new Flight("Paris", "Tokio"));
        flights.add(new Flight("Berlin", "Madrid"));
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Madrid", "Warsaw"));
    }

    public static List<Flight> getFlightsTable() {
        ArrayList<Flight> flight = new ArrayList<>();
        for (Flight flight1 : flights)
            flight.add(flight1);
        return flight;
    }

    public int size() {
        return flights.size();
    }
}
