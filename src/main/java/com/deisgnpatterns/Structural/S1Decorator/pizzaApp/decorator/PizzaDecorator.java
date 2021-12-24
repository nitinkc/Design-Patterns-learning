package com.deisgnpatterns.Structural.S1Decorator.pizzaApp.decorator;

import com.deisgnpatterns.Structural.S1Decorator.pizzaApp.component.Pizza;

public class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double price() {
        return 0;
    }

    @Override
    public String description() {
        return null;
    }
}
