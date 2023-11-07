package com.deisgnpatterns.D4Structural.S3AdapterPattern.vehicle;

public class Bus implements VehicleTarget{
    @Override
    public void horsePower() {
        System.out.println("Bus has 100 horse power");
    }

    @Override
    public void accelerate() {
        System.out.println("Bus Accelerating ...");
    }
}
