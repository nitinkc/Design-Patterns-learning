package com.uml.a5generalizationIsA.withExtends;

// Vehicle class representing common attributes and methods of all vehicles
public class Vehicle {
    private String manufacturer;
    private int year;

    // Constructor
    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // Method to accelerate the vehicle
    public void accelerate() {
        // Acceleration logic
    }

    // Method to apply brakes to the vehicle
    public void brake() {
        // Braking logic
    }
}