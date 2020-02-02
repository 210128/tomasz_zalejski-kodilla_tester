package com.kodilla.bank.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();

        double[] operations = cashMachine.getValues();

        assertEquals(0, operations.length);
    }

    @Test
    public void shouldAddFourOperations() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(1);
        cashMachine.addOperation(150);
        cashMachine.addOperation(1000);
        cashMachine.addOperation(-200);

        double[] operations = cashMachine.getValues();

        assertEquals(4, operations.length);
        assertEquals(1, operations[0]);
        assertEquals(150, operations[1]);
        assertEquals(1000, operations[2]);
        assertEquals(-200, operations[3]);
    }

    @Test
    public void shouldCountNumberOfOperations() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(0.1);
        cashMachine.addOperation(150);
        cashMachine.addOperation(1000);
        cashMachine.addOperation(-200);
        cashMachine.addOperation(0);
        cashMachine.addOperation(-0.1);

        int countOfOperations = cashMachine.getNumberOfOperations();

        assertEquals(5, countOfOperations, 0.01);
    }

    @Test
    public void shouldCalculateOperationsBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(1.5);
        cashMachine.addOperation(150.10);
        cashMachine.addOperation(1000.69);
        cashMachine.addOperation(-200.0);

        assertEquals(952.29, cashMachine.getOperationsBalance(), 0.01);
    }

    @Test
    public void shouldCountNumberOfPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(1000.69);
        cashMachine.addOperation(-200.0);
        cashMachine.addOperation(0.5);
        cashMachine.addOperation(0);
        cashMachine.addOperation(-0.5);

        int countOfPayments = cashMachine.getNumberOfPayments();

        assertEquals(2, countOfPayments, 0.01);
    }

    @Test
    public void shouldCountNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(1000.69);
        cashMachine.addOperation(-200.0);
        cashMachine.addOperation(0.5);
        cashMachine.addOperation(0);
        cashMachine.addOperation(-0.5);
        cashMachine.addOperation(-3000);

        int countOfWithdrawals = cashMachine.getNumberOfWithdrawals();

        assertEquals(3, countOfWithdrawals, 0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();

        assertEquals(0, cashMachine.getPaymentAverage(), 0.0001);
        assertEquals(0, cashMachine.getNumberOfWithdrawals(), 0.0001);
    }

    @Test
    public void shouldReturnAveragePaymentEqualsZeroIfMoneyWasOnlyPaidOut() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(-1000.69);
        cashMachine.addOperation(-200.0);
        cashMachine.addOperation(0);

        assertEquals(0, cashMachine.getPaymentAverage(), 0.0001);
    }

    @Test
    public void shouldReturnAveragePaymentEqualsZeroIfMoneyWasOnlyPaidIn() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOperation(1000.69);
        cashMachine.addOperation(200.0);
        cashMachine.addOperation(0);

        assertEquals(0, cashMachine.getWithdrawalsAverage(), 0.0001);
    }
}
