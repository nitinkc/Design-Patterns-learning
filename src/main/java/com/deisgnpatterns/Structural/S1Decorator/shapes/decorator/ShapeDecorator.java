package com.deisgnpatterns.Structural.S1Decorator.shapes.decorator;

import com.deisgnpatterns.Structural.S1Decorator.shapes.component.Shape;

public abstract class ShapeDecorator implements Shape {

    private Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void draw() {
        this.shape.draw();
    }
}
