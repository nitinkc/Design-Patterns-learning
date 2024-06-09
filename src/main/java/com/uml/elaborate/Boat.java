package com.uml.elaborate;

// Boat class representing a boat component
public class Boat extends Vehicle implements Drivable {
    private int length;
    private String type;
    private Engine engine;
    private Rudder rudder;

    public Boat(String manufacturer, String model, int length, String type, Engine engine, Rudder rudder) {
        super(manufacturer, model);
        this.length = length;
        this.type = type;
        this.engine = engine;
        this.rudder = rudder;
    }

    public void navigate() {
        // Implementation of navigate method
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
