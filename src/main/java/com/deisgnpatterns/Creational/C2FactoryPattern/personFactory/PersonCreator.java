package com.deisgnpatterns.Creational.C2FactoryPattern.personFactory;

/**
 * Created by nichaurasia on Sunday, May/10/2020 at 11:27 PM
 */

public class PersonCreator {

    public Person wishPerson(String wish){
        Person person = PersonFactory.createPerson(wish);
        person.wish(wish);

        return person;
    }
}