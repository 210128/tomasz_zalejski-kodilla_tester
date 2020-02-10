package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
  public ArrayList<Flight> flights = new ArrayList<>();

    public FlightRepository(){
        this.flights.add(new Flight("Warsaw", "Gdańsk"));
        this.flights.add(new Flight("Berlin", "Kraków"));
        this.flights.add(new Flight("Paris", "Tokio"));
        this.flights.add(new Flight("Berlin", "Madrid"));
        this.flights.add(new Flight("Warsaw","Berlin"));
        this.flights.add(new Flight("Madrid", "Warsaw"));
    }
    public  List<Flight> getFlightsTable(){
        ArrayList<Flight> flight = new ArrayList<>();
        for(Flight flight1: flights)
            flight.add(flight1);

        return flight;
    }

    public int size() {
        return flights.size();
    }
}
