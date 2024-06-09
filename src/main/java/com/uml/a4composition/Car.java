package com.uml.a4composition;

import com.uml.Engine;

// Car class representing a car component
public class Car {
    // Composition relationship with Engine class
    private Engine engine;

    // Constructor
    public Car() {
        // Creating Engine instance within Car (Composition)
        this.engine = new Engine(200, "diesel"); // Assuming 200 horsepower
    }

    // Method to start driving
    public void startDriving() {
        // Implementation of start driving method
        System.out.println("Car started driving.");
    }

    // Method to stop driving
    public void stopDriving() {
        // Implementation of stop driving method
        System.out.println("Car stopped driving.");
    }

    // Method to start the engine
    public void startEngine() {
        // Delegating the task to the Engine object
        engine.start();
    }

    // Method to stop the engine
    public void stopEngine() {
        // Delegating the task to the Engine object
        engine.stop();
    }
}
