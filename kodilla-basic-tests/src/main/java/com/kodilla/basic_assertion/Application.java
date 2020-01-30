package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.addition(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda addition działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda addition nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractionResult = calculator.subtraction(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subtractionResult);

        if (correctSub) {
            System.out.println("Metoda subtraction działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtraction nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int powResult = calculator.pow(a);
        boolean correctPow = ResultChecker.assertEquals(25, powResult);

        if (correctPow) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczby " + a);
        }


    }

}
