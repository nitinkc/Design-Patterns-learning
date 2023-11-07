package com.deisgnpatterns.D4Structural.S3AdapterPattern.vehicle;

public class Runner {
    public static void main(String[] args) {

        VehicleTarget car = new Car();
        car.horsePower();
        car.accelerate();

        System.out.println();
        VehicleTarget bus = new Bus();
        bus.horsePower();
        bus.accelerate();

        System.out.println();
        VehicleTarget bicycle = new Adapter(new Bicycle());
        bicycle.horsePower();
        bicycle.accelerate();

    }
}
