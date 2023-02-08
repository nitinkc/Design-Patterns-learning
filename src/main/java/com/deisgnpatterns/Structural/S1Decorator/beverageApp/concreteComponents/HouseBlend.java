package com.deisgnpatterns.Structural.S1Decorator.beverageApp.concreteComponents;

import com.deisgnpatterns.Structural.S1Decorator.beverageApp.Beverage;

//Mandatory Base class
public class HouseBlend implements Beverage {
	@Override
	public Double getCost() {
		return 5.0;
	}

	@Override
	public String getDescription() {
		return "Plain Coffee ";
	}
}
