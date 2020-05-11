package com.deisgnpatterns.Creational.C2FactoryPattern.personFactory;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 11:15 PM
 */

public class Female implements Person {
    @Override
    public void wish(String msg) {
        System.out.println("Female Says : " + msg);

    }
}
