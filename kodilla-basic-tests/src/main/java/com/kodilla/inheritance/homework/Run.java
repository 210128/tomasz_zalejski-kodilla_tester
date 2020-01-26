package com.kodilla.inheritance.homework;

public class Run {
    public static void main(String[] args) {
Windows win95 = new Windows(1995);
win95.turnOn();
win95.displayReleaseYear();

MacOs puma = new MacOs(2001);
puma.turnOff();
puma.displayReleaseYear();
    }
}
