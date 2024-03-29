package com.deisgnpatterns.D4Structural.S1Decorator.uml;

public class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
