package learning.shape;

import learning.factory.AbstractFactory;
import learning.shape.impl.Circle;
import learning.shape.impl.Rectangle;

/**
 * The ShapeFactory class implements the AbstractFactory interface and is responsible for creating instances of the Shape interface.
 * It provides a create() method to create specific shapes based on the given type.
 */
public class ShapeFactory implements AbstractFactory<Shape> {
    @Override
    public Shape create(String type) {
        if ("Rectangle".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        }
        return null;
    }
}