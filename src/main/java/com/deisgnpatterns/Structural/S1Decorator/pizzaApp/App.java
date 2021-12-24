package com.deisgnpatterns.Structural.S1Decorator.pizzaApp;

import com.deisgnpatterns.Structural.S1Decorator.pizzaApp.component.Pizza;
import com.deisgnpatterns.Structural.S1Decorator.pizzaApp.concreteComponent.PlainPizza;
import com.deisgnpatterns.Structural.S1Decorator.pizzaApp.concreteDecorator.PacificVeggie;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new PacificVeggie(new PacificVeggie(new PlainPizza()));

        System.out.println(pizza.price() + pizza.description());
    }
}
