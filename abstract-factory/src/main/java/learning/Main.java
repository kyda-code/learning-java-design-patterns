package learning;

import learning.color.Color;
import learning.factory.AbstractFactory;
import learning.factory.FactoryProvider;
import learning.shape.Shape;

/**
 * The Main class is the entry point of the application.
 *
 * It demonstrates the usage of Abstract Factory pattern by creating shapes and colors using the provided factories.
 * It uses the FactoryProvider class to get the appropriate factory based on the provided type.
 * The factories are responsible for creating objects of type Shape and Color, respectively.
 * Shapes and colors are created using the create() method of the respective factory.
 * The Shape objects provide the draw() method to draw the shape, and the Color objects provide the fill() method to fill with color.
 *
 * Example usage:
 *     AbstractFactory<Shape> shapeFactory = FactoryProvider.getFactory("Shape");
 *     Shape shape1 = shapeFactory.create("Circle");
 *     shape1.draw();
 *
 *     AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("Color");
 *     Color color1 = colorFactory.create("Red");
 *     color1.fill();
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory<Shape> shapeFactory = FactoryProvider.getFactory("Shape");
        if (shapeFactory == null) {
            System.out.println("Factory not found");
            System.exit(1);
        }
        Shape shape1 = shapeFactory.create("Circle");
        shape1.draw();

        AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("Color");
        if (colorFactory == null) {
            System.out.println("Factory not found");
            System.exit(1);
        }
        Color color1 = colorFactory.create("Red");
        color1.fill();
    }
}