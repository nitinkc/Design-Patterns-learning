package com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory.pizzaTypes;

import com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory.Pizza;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 9:53 PM
 */

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing VEGGIE Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking VEGGIE Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting VEGGIE Pizza");
    }
}
