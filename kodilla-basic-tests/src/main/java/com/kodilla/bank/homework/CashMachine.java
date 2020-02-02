package com.kodilla.bank.homework;

public class CashMachine {
    private double[] cashOperations;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.cashOperations = new double[0];
    }

    public void addOperation(double operation) {
        if (operation != 0) {
            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(cashOperations, 0, newTab, 0, cashOperations.length);
            newTab[this.size - 1] = operation;
            this.cashOperations = newTab;
        }
    }

    public double[] getValues() {
        return cashOperations;
    }

    public double getOperationsBalance() {
        double operationsBalance = 0;
        for (double operationBalance : this.cashOperations) {
            operationsBalance += operationBalance;
        }
        return operationsBalance;
    }

    public int getNumberOfOperations() {
        return this.cashOperations.length;
    }

    public int getNumberOfPayments() {
        int paymentNumbers = 0;
        for (double payNumbers : this.cashOperations) {
            if (payNumbers > 0) {
                paymentNumbers++;
            }
        }
        return paymentNumbers;
    }

    public int getNumberOfWithdrawals() {
        int withdrawalsNumbers = 0;
        for (double payNumbers : this.cashOperations) {
            if (payNumbers < 0) {
                withdrawalsNumbers++;
            }
        }
        return withdrawalsNumbers;
    }

    public double getPaymentAverage() {
        if (this.cashOperations.length == 0) {
            return 0.0;
        }
        double average = 0;
        int sum = 0;
        for (double paymentAverage : this.cashOperations) {
            if (paymentAverage > 0) {
                average += paymentAverage;
                sum++;
            }
        }
        if (sum == 0) {
            return 0;
        }
        return average / sum;
    }

    public double getWithdrawalsAverage() {
        if (this.cashOperations.length == 0) {
            return 0.0;
        }
        double average = 0;
        int sum = 0;
        for (double withdrawalsAverage : this.cashOperations) {
            if (withdrawalsAverage < 0) {
                average += withdrawalsAverage;
                sum++;
            }
        }
        if (sum == 0) {
            return 0;
        }
        return average / sum;
    }
}
