package com.deisgnpatterns.Structural.S1Decorator.shapes.concreteDecorator;

import com.deisgnpatterns.Structural.S1Decorator.shapes.component.Shape;
import com.deisgnpatterns.Structural.S1Decorator.shapes.enums.Color;
import com.deisgnpatterns.Structural.S1Decorator.shapes.decorator.ShapeDecorator;

public class ColoredShapeDecorator extends ShapeDecorator {

    private Shape shape;//Has a relationship
    private Color color;

    public ColoredShapeDecorator(Shape shape, Color color) {
        super(shape);
        this.shape = shape;
        this.color = color;
    }

    @Override
    public void draw() {
        String ret =  color + " :: Colored Shape";
        System.out.println(ret);
        //return ret;
    }
}
