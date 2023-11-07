package com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteComponents;

import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public Double getCost() {
        return 5.5;
    }

    @Override
    public String getDescription() {
        return "Excellent Dark Roast";
    }
}
