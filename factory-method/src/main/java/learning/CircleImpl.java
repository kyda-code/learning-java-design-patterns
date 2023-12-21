package learning;

import learning.interfaces.Shape;
/**
 * The CircleImpl class represents a circle shape that can be drawn.
 * It implements the Shape interface and provides an implementation for the draw() method.
 * When the draw() method is called, it will print "Drawing a circle".
 */
public class CircleImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
