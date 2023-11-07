package com.deisgnpatterns.D4Structural.S1Decorator.shapes.concreteDecorator;

import com.deisgnpatterns.D4Structural.S1Decorator.shapes.component.Shape;
import com.deisgnpatterns.D4Structural.S1Decorator.shapes.enums.Color;
import com.deisgnpatterns.D4Structural.S1Decorator.shapes.decorator.ShapeDecorator;

public class ColoredShapeDecorator extends ShapeDecorator {

    private Shape shape;//Has a relationship

    public ColoredShapeDecorator(Shape shape, Color color) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw() {
        //return ret;
    }
}
