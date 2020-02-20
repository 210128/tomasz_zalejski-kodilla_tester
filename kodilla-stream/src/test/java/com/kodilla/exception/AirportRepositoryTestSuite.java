package com.kodilla.exception;

import org.junit.jupiter.api.Test;//JUnit 5 used

import static org.junit.jupiter.api.Assertions.*;

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

      //TODO: Review -> @Test(expected = is not valid in JUnit 5

      //  @Test(expected = AirportNotFoundException.class)

        @Test
        /*Tests to run cannot be private*/
        public void testIsAirportInUse_withException() throws AirportNotFoundException {

            //given
            AirportRepository airportRepository = new AirportRepository();
            //when
            //boolean isWarsawInUse =
            //
            assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUSe("Vienna"));
            //then
            //assertFalse(isWarsawInUse);
        }
    }
