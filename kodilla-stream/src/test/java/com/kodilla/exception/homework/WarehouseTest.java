package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseTest {

    @Test
    /*Tests to run cannot be private*/

    public void testGetOrder_withException() throws OrderDoesntExistException {

        //given
        var wh = new Warehouse();

        //when
        //boolean isWarsawInUse =
        //

        assertThrows(OrderDoesntExistException.class, () -> wh.getOrder("jakikolwiek"));
        //then
        //assertFalse(isWarsawInUse);
    }
}
