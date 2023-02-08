package com.deisgnpatterns.Structural.S1Decorator.shapes.concreteComponent;

import com.deisgnpatterns.Structural.S1Decorator.shapes.component.Shape;

public class Polygon implements Shape {
    private int vertices;
    @Override
    public void draw() {
        this.vertices = 4;
    }

    public Polygon(){
        this.vertices = vertices;
    }

}
