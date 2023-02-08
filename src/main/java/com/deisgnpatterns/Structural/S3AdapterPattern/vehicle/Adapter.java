package com.deisgnpatterns.Structural.S3AdapterPattern.vehicle;

public class Adapter implements VehicleTarget {
    private Bicycle bicycle;

    public Adapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void horsePower() {
        bicycle.getPower();
    }

    @Override
    public void accelerate() {
        bicycle.go();
    }
}