package com.uml;

import java.util.List;

// Child class inheriting from Vehicle
// <<implements>>
public class Car extends Vehicle implements Drivable { // Car inherits from Vehicle and implements Drivable interface

    private List<Wheel> wheels; // Aggregation relationship: Car "has-a" List of Wheel objects
    private Engine engine;      // Composition relationship: Car "has-a" Engine object

    // Constructor: initializes Car with a list of wheels
    public Car(List<Wheel> wheels) {
        this.wheels = wheels; // Assigning wheels passed as parameter
        this.engine = new Engine(200,"petrol"); // Creating a new Engine instance (Composition)
    }

    // Implementation of methods from Drivable interface
    public void drive(Engine engine) { // Dependency on Engine class
        // Implementation of drive method using Engine
    }
}

