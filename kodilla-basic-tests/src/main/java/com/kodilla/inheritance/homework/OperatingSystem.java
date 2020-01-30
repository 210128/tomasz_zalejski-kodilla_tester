package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private final int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
System.out.println("System starts up");
    }

    public void turnOff() {
System.out.println("System turns off ");
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void displayReleaseYear(){
        System.out.println("The system was released in " + getReleaseYear());
    }
}
