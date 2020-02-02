package com.kodilla.bank.homework;

public class Bank {
    private String user;
    private CashMachine cashMachine;
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;

    public Bank(String user) {
        this.user = user;
        this.cashMachine = new CashMachine();
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();

    }

    public void addOperationCashMachine(double operation) {
        this.cashMachine.addOperation(operation);
    }

    public void addOperationCashMachine1(double operation) {
        this.cashMachine1.addOperation(operation);
    }

    public void addOperationCashMachine2(double operation) {
        this.cashMachine2.addOperation(operation);
    }

    public double getCashMachineBalance() {
        return this.cashMachine.getOperationsBalance();
    }

    public double getCashMachine1Balance() {
        return this.cashMachine1.getOperationsBalance();
    }

    public double getCashMachine2Balance() {
        return this.cashMachine2.getOperationsBalance();
    }

    public int getNumberOfOperationsOfCashMachine() {
        return this.cashMachine.getNumberOfOperations();
    }

    public int getNumberOfOperationsOfCashMachine1() {
        return this.cashMachine1.getNumberOfOperations();
    }

    public int getNumberOfOperationsOfCashMachine2() {
        return this.cashMachine2.getNumberOfOperations();
    }

    public int getSumOfUserOperations() {
        return this.cashMachine.getNumberOfOperations() + this.cashMachine1.getNumberOfOperations() + this.cashMachine2.getNumberOfOperations();
    }

    public double sumOfAllBalances() {
        return this.cashMachine.getOperationsBalance() + this.cashMachine1.getOperationsBalance() + this.cashMachine2.getOperationsBalance();
    }

    public int numberOfPayment() {
        return this.cashMachine.getNumberOfPayments() + this.cashMachine1.getNumberOfPayments() + this.cashMachine2.getNumberOfPayments();
    }

    public int numberOfWithdrawals() {
        return this.cashMachine.getNumberOfWithdrawals() + this.cashMachine1.getNumberOfWithdrawals() + this.cashMachine2.getNumberOfWithdrawals();
    }

    public double averageOfPayments() {
        return this.cashMachine.getPaymentAverage();
    }

    public double averageOfPayments1() {
        return this.cashMachine1.getPaymentAverage();
    }

    public double averageOfPayments2() {
        return this.cashMachine2.getPaymentAverage();
    }

    public double averageOfWithdrawals() {
        return this.cashMachine.getWithdrawalsAverage();
    }

    public double averageOfWithdrawals1() {
        return this.cashMachine1.getWithdrawalsAverage();
    }

    public double averageOfWithdrawals2() {
        return this.cashMachine2.getWithdrawalsAverage();
    }

    public double totalAverageOfPayments() {
        double totalPaymentAverage = this.cashMachine.getPaymentAverage() + this.cashMachine1.getPaymentAverage() + this.cashMachine2.getPaymentAverage();
        return totalPaymentAverage / 3;
    }

    public double totalAverageOfWithdrawals() {
        double totalWithdrawalsAverage = this.cashMachine.getWithdrawalsAverage() + this.cashMachine1.getWithdrawalsAverage() + this.cashMachine2.getWithdrawalsAverage();
        return totalWithdrawalsAverage / 3;
    }
}

