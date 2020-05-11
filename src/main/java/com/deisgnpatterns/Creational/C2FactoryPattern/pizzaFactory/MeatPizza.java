package com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 9:54 PM
 */

public class MeatPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing MEAT Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking MEAT Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting MEAT Pizza");
    }
}