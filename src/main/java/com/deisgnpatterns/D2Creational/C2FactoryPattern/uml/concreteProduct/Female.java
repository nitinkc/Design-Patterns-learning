package com.deisgnpatterns.D2Creational.C2FactoryPattern.uml.concreteProduct;

import com.deisgnpatterns.D2Creational.C2FactoryPattern.personFactory.Person;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 11:15 PM
 */

public class Female implements Person {
    @Override
    public void wish(String msg) {
        System.out.println("Female Says : " + msg);

    }
}
