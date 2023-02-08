package com.deisgnpatterns.Structural.S1Decorator.beverageApp.concreteComponents;

import com.deisgnpatterns.Structural.S1Decorator.beverageApp.Beverage;

public class Decaf implements Beverage {
    @Override
    public Double getCost() {
        return 4.5;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}