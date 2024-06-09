package com.uml.a5generalizationIsA.withExtends;

// Boat class representing specific attributes and methods of boats, inheriting from Vehicle
public class Boat extends Vehicle {
    private String type;
    private int length;

    // Constructor
    public Boat(String manufacturer, int year, String type, int length) {
        super(manufacturer, year);
        this.type = type;
        this.length = length;
    }

    // Method to raise anchor for the boat
    public void raiseAnchor() {
        // Logic to raise anchor
    }

    // Method to lower anchor for the boat
    public void lowerAnchor() {
        // Logic to lower anchor
    }

    // Method to apply brakes to the boat
    @Override
    public void brake() {
        // Braking logic for boat
    }
}