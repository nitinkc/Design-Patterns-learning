package com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteDecorators;

import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.Beverage;
import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.BeverageDecorator;

public class Milk extends BeverageDecorator {

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public Double getCost() {
		return this.beverage.getCost()+ 1.5;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+"milk ";
	}
}
