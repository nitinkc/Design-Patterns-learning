package com.deisgnpatterns.Structural.S1Decorator.beverageApp.concreteComponents;

import com.deisgnpatterns.Structural.S1Decorator.beverageApp.Beverage;

public class Espresso implements Beverage {
    @Override
    public Double getCost() {
        return 6.0;
    }

    @Override
    public String getDescription() {
        return "Espresso Coffee ";
    }
}
