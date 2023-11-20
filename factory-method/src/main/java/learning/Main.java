package learning;

import learning.factory.CircleFactory;
import learning.factory.RectangleFactory;
import learning.interfaces.Shape;
import learning.interfaces.ShapeFactory;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Circle using CircleFactory
        ShapeFactory shapeFactory = new CircleFactory();
        Shape circle = shapeFactory.createShape();
        circle.draw();

        // Create a Rectangle using RectangleFactory
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}

