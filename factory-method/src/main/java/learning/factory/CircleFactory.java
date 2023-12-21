package learning.factory;

import learning.CircleImpl;
import learning.interfaces.Shape;
import learning.interfaces.ShapeFactory;

/**
 * A factory class for creating Circle objects.
 */
public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new CircleImpl();
    }
}
