package com.deisgnpatterns.D4Structural.S1Decorator.shapes.concreteDecorator;

import com.deisgnpatterns.D4Structural.S1Decorator.shapes.component.Shape;
import com.deisgnpatterns.D4Structural.S1Decorator.shapes.decorator.ShapeDecorator;

public class TexturedShapeDecorator  extends ShapeDecorator {
    public TexturedShapeDecorator(Shape shape) {
        super(shape);
    }
}
