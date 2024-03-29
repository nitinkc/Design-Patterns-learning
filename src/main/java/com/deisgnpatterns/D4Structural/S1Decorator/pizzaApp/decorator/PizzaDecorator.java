package com.deisgnpatterns.D4Structural.S1Decorator.pizzaApp.decorator;

import com.deisgnpatterns.D4Structural.S1Decorator.pizzaApp.component.Pizza;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}
