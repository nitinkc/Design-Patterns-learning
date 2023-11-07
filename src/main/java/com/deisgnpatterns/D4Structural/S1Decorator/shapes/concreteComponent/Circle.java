package com.deisgnpatterns.D4Structural.S1Decorator.shapes.concreteComponent;

import com.deisgnpatterns.D4Structural.S1Decorator.shapes.component.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        String ret = "Drawing Circle : ";
        System.out.println(ret);
        //return  ret;
    }
}
