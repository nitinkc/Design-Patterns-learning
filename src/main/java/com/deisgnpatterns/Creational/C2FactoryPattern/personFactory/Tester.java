package com.deisgnpatterns.Creational.C2FactoryPattern.personFactory;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 11:35 PM
 */

public class Tester {
    public static void main(String[] args) {
        PersonCreator pc = new PersonCreator();
        pc.wishPerson("feMALE");
    }
}
