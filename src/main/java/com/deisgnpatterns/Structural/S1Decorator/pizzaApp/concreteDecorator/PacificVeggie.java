package com.deisgnpatterns.Structural.S1Decorator.pizzaApp.concreteDecorator;

import com.deisgnpatterns.Structural.S1Decorator.pizzaApp.component.Pizza;
import com.deisgnpatterns.Structural.S1Decorator.pizzaApp.decorator.PizzaDecorator;

public class PacificVeggie extends PizzaDecorator {
    private Pizza pizza;

    public PacificVeggie(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    @Override
    public double price() {
        return 11 + this.pizza.price();
    }

    @Override
    public String description() {
        return "Pacific veggie Pizza with " + this.pizza.description();
    }
}
