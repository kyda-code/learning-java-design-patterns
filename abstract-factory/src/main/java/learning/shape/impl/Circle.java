package learning.shape.impl;

import learning.shape.Shape;

/**
 * The Circle class represents a circle shape that implements the Shape interface. It provides the ability to draw a circle.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle shape...");
    }
}