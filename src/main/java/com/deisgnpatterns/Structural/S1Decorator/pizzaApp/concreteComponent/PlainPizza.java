package com.deisgnpatterns.Structural.S1Decorator.pizzaApp.concreteComponent;

import com.deisgnpatterns.Structural.S1Decorator.pizzaApp.component.Pizza;

public class PlainPizza implements Pizza {
    @Override
    public double price() {
        return 10;
    }

    @Override
    public String description() {
        return "Plain Pizza";
    }
}
