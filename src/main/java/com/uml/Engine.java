package com.uml;

// Contained class
public class Engine {
    // Attributes
    private int horsepower;
    private String fuelType;

    // Constructor
    public Engine(int horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    // Method to start the engine
    public void start() {
        // Start engine logic
        System.out.println("Engine started.");
    }

    // Method to stop the engine
    public void stop() {
        // Stop engine logic
        System.out.println("Engine stopped.");
    }
}
