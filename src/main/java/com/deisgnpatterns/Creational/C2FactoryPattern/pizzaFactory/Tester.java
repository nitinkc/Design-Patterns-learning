package com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 10:11 PM
 */

public class Tester {
    public static void main(String[] args) {
        PizzaStore ps= new PizzaStore();

        ps.orderPizza("Cheese");
        ps.orderPizza("Veggie");
    }
}
