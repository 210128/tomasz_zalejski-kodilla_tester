package com.kodilla.collections.adv.exercises.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightRepositoryTest {
    @Test
    public void testGetFlightsTable() {
        FlightRepository flightRepository = new FlightRepository();
        flightRepository.getFlightsTable();
        assertEquals(6, flightRepository.size());
    }
}