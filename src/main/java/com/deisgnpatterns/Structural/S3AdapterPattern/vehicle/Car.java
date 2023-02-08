package com.deisgnpatterns.Structural.S3AdapterPattern.vehicle;

public class Car implements VehicleTarget {

    @Override
    public void horsePower() {
        System.out.println("Car has 10 horse power");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerating ...");
    }
}

