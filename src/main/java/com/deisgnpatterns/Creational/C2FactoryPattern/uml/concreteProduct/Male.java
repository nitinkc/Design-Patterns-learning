package com.deisgnpatterns.Creational.C2FactoryPattern.uml.concreteProduct;

import com.deisgnpatterns.Creational.C2FactoryPattern.personFactory.Person;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 11:14 PM
 */

public class Male implements Person {
    @Override
    public void wish(String msg) {
        System.out.println("Male Says : " + msg);
    }
}
