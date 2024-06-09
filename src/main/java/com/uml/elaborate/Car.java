package com.uml.elaborate;

import java.util.List;

// Car class representing a car component
public class Car extends Vehicle implements Drivable {
    private List<Wheel> wheels;
    private Engine engine;
    private int speed;

    public Car(String manufacturer, String model, List<Wheel> wheels, Engine engine) {
        super(manufacturer, model);
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive() {
        // Implementation of drive method
    }

    @Override
    public void start() {
        // Implementation of start method from Drivable interface
    }

    @Override
    public void stop() {
        // Implementation of stop method from Drivable interface
    }
}

