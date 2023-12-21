package learning.factory;

import learning.RectangleImpl;
import learning.interfaces.Shape;
import learning.interfaces.ShapeFactory;

/**
 * A factory class for creating Rectangle objects.
 */
public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new RectangleImpl();
    }
}
