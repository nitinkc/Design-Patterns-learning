package com.deisgnpatterns.Structural.S1Decorator.shapes;

import com.deisgnpatterns.Structural.S1Decorator.shapes.component.Shape;
import com.deisgnpatterns.Structural.S1Decorator.shapes.concreteComponent.Circle;
import com.deisgnpatterns.Structural.S1Decorator.shapes.concreteDecorator.ColoredShapeDecorator;
import com.deisgnpatterns.Structural.S1Decorator.shapes.enums.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Requirement is to add the functionality later and
 */
public class App {
    public static void main(String[] args) {
        Shape circle = new ColoredShapeDecorator(new Circle(), Color.RED);

        circle.draw();
    }
}
