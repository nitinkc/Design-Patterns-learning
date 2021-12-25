package com.deisgnpatterns.Structural.S1Decorator.shapes.concreteComponent;

import com.deisgnpatterns.Structural.S1Decorator.shapes.component.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle :: ");
    }
}
