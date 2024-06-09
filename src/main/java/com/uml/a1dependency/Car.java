package com.uml.a1dependency;

import com.uml.Engine;

// Car class representing a car component
public class Car {
    // Dependency on the Engine class
    private final Engine engine;

    // Constructor
    public Car(Engine engine) {
        this.engine = engine;//Like constructor injection
        //dependencies are provided to the class via its constructor.
    }

    // Method to start driving
    public void drive() {
        // Implementation of drive method using Engine
        engine.start();
        System.out.println("Car is driving.");
    }

    // Method to stop driving
    public void stop() {
        // Implementation of stop method using Engine
        engine.stop();
        System.out.println("Car has stopped.");
    }
}


