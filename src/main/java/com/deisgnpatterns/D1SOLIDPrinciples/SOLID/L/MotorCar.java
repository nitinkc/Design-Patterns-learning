package com.deisgnpatterns.D1SOLIDPrinciples.SOLID.L;

public class MotorCar implements NormalVehicle {

	@Override
	public void accelerate() {
		System.out.println("Speed up the car...");
	}

	@Override
	public void addFuel() {
		System.out.println("Adding fuel to car...");
	}
}
