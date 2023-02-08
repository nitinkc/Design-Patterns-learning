package com.deisgnpatterns.Structural.S3AdapterPattern.vehicle;

public class Bicycle implements VehicleAdaptee {
    @Override
    public void getPower() {
        System.out.println("Bicycle is Dynamo Powered");
    }

    @Override
    public void go(){
        System.out.println("Slowly going by Bicycle");
    }
}
