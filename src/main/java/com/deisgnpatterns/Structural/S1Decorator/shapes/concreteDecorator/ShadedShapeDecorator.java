package com.deisgnpatterns.Structural.S1Decorator.shapes.concreteDecorator;

import com.deisgnpatterns.Structural.S1Decorator.shapes.component.Shape;
import com.deisgnpatterns.Structural.S1Decorator.shapes.enums.Shade;
import com.deisgnpatterns.Structural.S1Decorator.shapes.decorator.ShapeDecorator;

public class ShadedShapeDecorator extends ShapeDecorator {

    private Shape shape;
    private Shade shade;

    public ShadedShapeDecorator(Shape shape, Shade shade) {
        super(shape);
        this.shape = shape;
        this.shade = shade;
    }

    @Override
    public void draw() {
        String ret =  shade + " :: Shaded Shape";
        System.out.println(ret);
        //return ret;
    }
}
