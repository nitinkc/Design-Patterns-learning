package com.deisgnpatterns.D1SOLIDPrinciples.SOLID.L;

public class ElectricCar implements ElectricVehicle {

	@Override
	public void accelerate() {
		System.out.println("Speed up with electric car...");
	}

	@Override
	public void chargeBattery() {
		System.out.println("Charging the battery...");
	}
}
