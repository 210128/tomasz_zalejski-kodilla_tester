package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateOfOperationsNumbers() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5);
        user.addOperationCashMachine1(893);
        user.addOperationCashMachine1(0);

        int countOperationsCashMachine = user.getNumberOfOperationsOfCashMachine();
        int countOperationsCashMachine1 = user.getNumberOfOperationsOfCashMachine1();
        int countOperationsCashMachine2 = user.getNumberOfOperationsOfCashMachine2();

        assertEquals(2, countOperationsCashMachine);
        assertEquals(1, countOperationsCashMachine1);
        assertEquals(1, countOperationsCashMachine2);
    }

    @Test
    public void shouldCalculateOfOperationsNumbersFromAllCashMachine() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5);
        user.addOperationCashMachine1(893);
        user.addOperationCashMachine1(0);

        int countAllOperations = user.getSumOfUserOperations();

        assertEquals(4, countAllOperations);
    }

    @Test
    public void shouldGetCashMachineBalance() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5);
        user.addOperationCashMachine1(0);

        double cashMachineBalance = user.getCashMachineBalance();
        double cashMachine1Balance = user.getCashMachine1Balance();
        double cashMachine2Balance = user.getCashMachine2Balance();

        assertEquals(55, cashMachineBalance, 0.01);
        assertEquals(0, cashMachine1Balance, 0.01);
        assertEquals(-20.0, cashMachine2Balance, 0.01);
    }

    @Test
    public void shouldGetAllCashMachineBalance() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50.4);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5.01);
        user.addOperationCashMachine1(0);

        double countCashMachinesBalances = user.sumOfAllBalances();

        assertEquals(35.41, countCashMachinesBalances, 0.001);
    }

    @Test
    public void shouldCountNumberOfPaymentsToCashMachine() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50.4);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5.01);
        user.addOperationCashMachine1(0);

        int countNumberOfPaymentsToCashMachine = user.numberOfPayment();

        assertEquals(2, countNumberOfPaymentsToCashMachine);
    }

    @Test
    public void shouldCountNumberOfWithdrawalsFromCashMachine() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50.4);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5.01);
        user.addOperationCashMachine1(0);

        int countNumberOfWithdrawalsFromCashMachine = user.numberOfWithdrawals();

        assertEquals(1, countNumberOfWithdrawalsFromCashMachine);
    }

    @Test
    public void shouldCalculateAverageOfPayments() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50.4);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5.01);
        user.addOperationCashMachine1(0);

        double countAveragePaymentsToCashMachine = user.averageOfPayments();
        double countAveragePaymentsToCashMachine1 = user.averageOfPayments1();
        double countAveragePaymentsToCashMachine2 = user.averageOfPayments2();

        assertEquals(27.705, countAveragePaymentsToCashMachine, 0.0001);
        assertEquals(0, countAveragePaymentsToCashMachine1, 0.0001);
        assertEquals(0, countAveragePaymentsToCashMachine2, 0.0001);
    }

    @Test
    public void shouldCalculateAverageOfWithdrawals() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50.4);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine(5.01);
        user.addOperationCashMachine1(0);

        double countAverageWithdrawalsFromCashMachine = user.averageOfWithdrawals();
        double countAverageWithdrawalsFromCashMachine1 = user.averageOfWithdrawals1();
        double countAverageWithdrawalsFromCashMachine2 = user.averageOfWithdrawals2();

        assertEquals(0, countAverageWithdrawalsFromCashMachine, 0.0001);
        assertEquals(0, countAverageWithdrawalsFromCashMachine1, 0.0001);
        assertEquals(-20, countAverageWithdrawalsFromCashMachine2, 0.0001);
    }

    @Test
    public void shouldCalculateTotalAveragePayments() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(50.4);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine2(220);
        user.addOperationCashMachine(5.01);
        user.addOperationCashMachine1(0);

        double calculateTotalAveragePayments = user.totalAverageOfPayments();

        assertEquals(82.5683, calculateTotalAveragePayments, 0.0001);
    }

    @Test
    public void shouldCalculateTotalAverageWithdrawals() {
        Bank user = new Bank("Janusz");
        user.addOperationCashMachine(-50.4);
        user.addOperationCashMachine2(-20);
        user.addOperationCashMachine2(-220);
        user.addOperationCashMachine(5.01);
        user.addOperationCashMachine1(0);

        double calculateTotalAverageWithdrawals = user.totalAverageOfWithdrawals();

        assertEquals(-56.80, calculateTotalAverageWithdrawals, 0.0001);
    }
}