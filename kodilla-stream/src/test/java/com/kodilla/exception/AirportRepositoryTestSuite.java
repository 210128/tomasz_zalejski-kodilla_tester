package com.kodilla.exception;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

    class AirportRepositoryTestSuite {

        @Test
        public void isAirportInUSe() throws AirportNotFoundException {
            //given
            AirportRepository airportRepository = new AirportRepository();
            //when
            boolean isWarsawInUse = airportRepository.isAirportInUSe("Warsaw");
            //then
            assertTrue(isWarsawInUse);
        }

        @Test(expected = AirportNotFoundException.class)
        private void testIsAirportInUse_withException() throws AirportNotFoundException {
            //given
            AirportRepository airportRepository = new AirportRepository();
            //when
            boolean isWarsawInUse = airportRepository.isAirportInUSe("Vienna");
            //then
            assertFalse(isWarsawInUse);
        }
    }
