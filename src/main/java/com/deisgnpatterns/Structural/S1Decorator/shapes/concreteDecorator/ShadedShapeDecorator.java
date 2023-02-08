package com.deisgnpatterns.Structural.S1Decorator.shapes.concreteDecorator;

import com.deisgnpatterns.Structural.S1Decorator.shapes.component.Shape;
import com.deisgnpatterns.Structural.S1Decorator.shapes.enums.Shade;
import com.deisgnpatterns.Structural.S1Decorator.shapes.decorator.ShapeDecorator;

public class ShadedShapeDecorator extends ShapeDecorator {

    private Shape shape;

    public ShadedShapeDecorator(Shape shape, Shade shade) {
        super(shape);

    }

    @Override
    public void draw() {

    }
}
