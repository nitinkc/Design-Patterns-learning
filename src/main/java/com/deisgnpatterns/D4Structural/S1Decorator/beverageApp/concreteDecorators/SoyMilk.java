package com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.concreteDecorators;

import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.Beverage;
import com.deisgnpatterns.D4Structural.S1Decorator.beverageApp.BeverageDecorator;

public class SoyMilk extends BeverageDecorator {

    Beverage beverage;

    public SoyMilk(Beverage beverage) {
       super(beverage);
        this.beverage = beverage;
    }

    @Override
    public Double getCost() {
        return this.beverage.getCost()+ 3.5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+"soy milk ";
    }

}