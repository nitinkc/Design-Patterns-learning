package com.deisgnpatterns.Structural.S1Decorator.shapes;

/**
 * Requirement is to add the functionality later and
 */
public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        ShapeDecorator shapeDecorator = new TransparentShapeDecorator(circle);
        //circle = new Circle(new ColoredShapeDecorator(new ShadedShapeDecorator(new Circle(5.5)))).draw();
    }
}
