package com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory;

import com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory.pizzaTypes.CheesePizza;
import com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory.pizzaTypes.MeatPizza;
import com.deisgnpatterns.Creational.C2FactoryPattern.pizzaFactory.pizzaTypes.VeggiePizza;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 9:55 PM
 */

public class PizzaFactory {

    //Factory Method for creating object.
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (null == type) {
            throw new IllegalArgumentException();
        }

        if(StringUtils.equalsAnyIgnoreCase("Cheese",type)){
            pizza = new CheesePizza();
        }else if(StringUtils.equalsAnyIgnoreCase("Veggie",type)){
            pizza = new VeggiePizza();
        }else if(StringUtils.equalsAnyIgnoreCase("Cheese",type)){
            pizza = new MeatPizza();
        }

        return pizza;
    }
}