package com.deisgnpatterns.D4Structural.S1Decorator.uml;

public class Runner {
    public static void main(String[] args) {
        Component c = new ConcreteDecorator(new ConcreteComponent());

        c = new ConcreteDecorator(new ConcreteDecorator(new ConcreteComponent()));

        c.operation();
    }
}
