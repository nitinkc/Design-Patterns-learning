package com.uml.a5generalizationIsA.withInterface;

/**
 * Created by Nitin C on 3/5/2016.
 * <p>
 * The Is-A relationship test is also known as INHERITANCE test.
 * IS-A: The property of an object being an instance of a data type.
 * This holds true for a child that is a subclass of any parent, be it a direct subclass or a distant child.
 * We use the multi-inheritance property of interfaces to preserve the IS-A relationship.
 * For example, a Cat is an Animal, and a Cat is also a Pet.
 **/


// Cat class implementing Animal and Pet interfaces, thus demonstrating IS-A relationship
public class Cat implements Animal, Pet {
    @Override
    public void eat() {
        // Implementation of eat behavior for Cat
    }

    @Override
    public void sleep() {
        // Implementation of sleep behavior for Cat
    }

    @Override
    public void play() {
        // Implementation of play behavior for Cat
    }

    @Override
    public void cuddle() {
        // Implementation of cuddle behavior for Cat
    }
}
