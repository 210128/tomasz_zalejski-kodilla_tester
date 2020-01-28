package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {

    public MacOs(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System MacOs starts up");
    }

    @Override
    public void turnOff() {
        System.out.println("System MacOs turns off");
    }
}
