package com.deisgnpatterns.D4Structural.S1Decorator.uml;

public class ConcreteDecorator extends Decorator{

    private int addedState = 10;
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        System.out.println("ConcreteDecorator");
    }

    public void addedBehaviour(){
        System.out.println("Added Behaviour " + addedState);
    }
}
