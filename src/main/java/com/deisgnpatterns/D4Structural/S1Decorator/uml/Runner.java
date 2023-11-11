package com.deisgnpatterns.D4Structural.S1Decorator.uml;

public class Runner {
    public static void main(String[] args) {
        ConcreteDecorator component = new ConcreteDecorator(new ConcreteComponent());
        Component c = component;

        c = new ConcreteDecorator(component);

        c.operation();
    }
}
