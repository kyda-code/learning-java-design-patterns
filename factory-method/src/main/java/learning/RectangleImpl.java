package learning;

import learning.interfaces.Shape;

public class RectangleImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}