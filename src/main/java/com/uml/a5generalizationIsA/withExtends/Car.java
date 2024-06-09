package com.uml.a5generalizationIsA.withExtends;


public class Car extends Vehicle{
    private String model;
    private int mileage;

    // Constructor
    public Car(String manufacturer, int year, String model, int mileage) {
        super(manufacturer, year);
        this.model = model;
        this.mileage = mileage;
    }

    // Method to honk the car's horn
    public void honk() {
        // Honking logic
    }

    // Method to apply brakes to the car
    @Override
    public void brake() {
        // Braking logic for car
    }
}