package learning;

import learning.factory.CircleFactory;
import learning.factory.RectangleFactory;
import learning.interfaces.Shape;
import learning.interfaces.ShapeFactory;

/**
 * The Main class is the entry point for the program. It demonstrates the use of the ShapeFactory interface and its implementations, CircleFactory and RectangleFactory, to create
 * and draw different shapes.
 *
 * The Main class contains a main() method that creates instances of Circle and Rectangle using the respective factories, and then calls the draw() method on each shape to display
 * the shape on the console.
 *
 * Usage:
 * 1. Run the Main class.
 * 2. The program will create a Circle using the CircleFactory and a Rectangle using the RectangleFactory.
 * 3. The draw() method of each shape will be called, which will print the corresponding shape on the console.
 *
 * Example:
 *
 * ShapeFactory shapeFactory = new CircleFactory();
 * Shape circle = shapeFactory.createShape();
 * circle.draw(); // Output: "Drawing a circle"
 *
 * ShapeFactory rectangleFactory = new RectangleFactory();
 * Shape rectangle = rectangleFactory.createShape();
 * rectangle.draw(); // Output: "Drawing a rectangle"
 *
 * Note: The Shape, ShapeFactory, CircleFactory, and RectangleFactory classes would need to be implemented separately.
 *
 * @see Shape
 * @see ShapeFactory
 * @see CircleFactory
 * @see RectangleFactory
 */
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

