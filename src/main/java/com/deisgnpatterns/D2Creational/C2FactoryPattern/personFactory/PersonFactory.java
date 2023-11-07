package com.deisgnpatterns.D2Creational.C2FactoryPattern.personFactory;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by nitin chaurasia on Sunday, May/10/2020 at 11:16 PM
 */

public class PersonFactory {
    public static Person createPerson(String wish) {
        Person person = null;
        if (null == wish) {
            throw new IllegalArgumentException();
        }

        if(StringUtils.equalsAnyIgnoreCase("Male", wish)) {
            person = new Male();
        }else if(StringUtils.equalsAnyIgnoreCase("Female", wish)) {
            person = new Female();
        }
        return person;
    }
}