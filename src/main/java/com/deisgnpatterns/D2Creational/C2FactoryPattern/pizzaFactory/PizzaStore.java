package com.deisgnpatterns.D2Creational.C2FactoryPattern.pizzaFactory;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 10:15 PM
 */

public class PizzaStore {
    public Pizza orderPizza(String type){

        Pizza pizza = PizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }
}
