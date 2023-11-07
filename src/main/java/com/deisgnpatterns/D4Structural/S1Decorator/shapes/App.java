package com.deisgnpatterns.D4Structural.S1Decorator.shapes;

import com.deisgnpatterns.D4Structural.S1Decorator.shapes.component.Shape;
import com.deisgnpatterns.D4Structural.S1Decorator.shapes.concreteComponent.Circle;
import com.deisgnpatterns.D4Structural.S1Decorator.shapes.concreteDecorator.ColoredShapeDecorator;
import com.deisgnpatterns.D4Structural.S1Decorator.shapes.enums.Color;

/**
 * Requirement is to add the functionality later and
 */
public class App {
    public static void main(String[] args) {
        Shape circle = new ColoredShapeDecorator(new Circle(), Color.RED);

        circle.draw();
    }
}
