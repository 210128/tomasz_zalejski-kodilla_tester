package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System Windows starts up");
    }

    @Override
    public void turnOff() {
        System.out.println("System Windows turns off");
    }
}
