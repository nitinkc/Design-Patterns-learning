package com.uml.a3aggregation;

import com.uml.Engine;

// Car class representing a car component
public class Car {
    // Aggregation relationship with Engine class
    private final Engine engine;

    // Constructor
    public Car(Engine engine) {
        this.engine = engine;
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
