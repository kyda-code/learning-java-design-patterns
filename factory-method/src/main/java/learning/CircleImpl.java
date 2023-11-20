package learning;

import learning.interfaces.Shape;
public class CircleImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
