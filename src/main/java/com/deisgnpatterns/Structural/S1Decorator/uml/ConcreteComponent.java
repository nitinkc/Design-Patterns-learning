package com.deisgnpatterns.Structural.S1Decorator.uml;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("From Concrete Component");
    }
}
