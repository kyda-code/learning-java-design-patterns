package learning.shape.impl;

import learning.shape.Shape;

/**
 * The Rectangle class represents a rectangle shape that implements the Shape interface. It provides the ability to draw a rectangle.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle shape...");
    }
}
