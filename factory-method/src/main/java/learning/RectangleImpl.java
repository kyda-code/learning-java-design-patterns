package learning;

import learning.interfaces.Shape;

/**
 * The RectangleImpl class is an implementation of the Shape interface
 * that represents a rectangle shape. It provides a draw() method to draw
 * a rectangle on the screen.
 */
public class RectangleImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}