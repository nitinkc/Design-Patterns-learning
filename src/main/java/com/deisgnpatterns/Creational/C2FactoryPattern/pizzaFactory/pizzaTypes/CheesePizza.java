package com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory.pizzaTypes;

import com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory.Pizza;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 9:46 PM
 */

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing CHEESE Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking CHEESE Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting CHEESE Pizza");
    }
}
