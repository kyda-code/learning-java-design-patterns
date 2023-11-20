# Factory Method Pattern Example in Java

This is a simple Java example demonstrating the Factory Method design pattern. The Factory Method pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

In this example, we have a shape drawing application with different types of shapes, such as circles and rectangles. We use the Factory Method pattern to create these shapes dynamically.

## Project Structure

The project consists of several Java files:

1. **Shape.java**: Defines the `Shape` interface with a `draw` method. It represents different types of shapes.

2. **Circle.java**: Implements the `Circle` class, a concrete shape that implements the `Shape` interface.

3. **Rectangle.java**: Implements the `Rectangle` class, another concrete shape that implements the `Shape` interface.

4. **ShapeFactory.java**: Defines the `ShapeFactory` interface with a `createShape` method, which is a factory method for creating shapes.

5. **CircleFactory.java**: Implements the `CircleFactory` class, which is a concrete factory for creating circles.

6. **RectangleFactory.java**: Implements the `RectangleFactory` class, which is a concrete factory for creating rectangles.

7. **Main.java**: Demonstrates how to use the Factory Method pattern to create and draw shapes using different factories.

## Usage

To run the example, you can compile and execute the `Main.java` file. It creates shapes (circle and rectangle) using their respective factories and demonstrates how the Factory Method pattern allows you to create objects without specifying their exact class.

```bash
javac Main.java
java Main
