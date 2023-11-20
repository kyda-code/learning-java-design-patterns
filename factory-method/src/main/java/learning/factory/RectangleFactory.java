package learning.factory;

import learning.RectangleImpl;
import learning.interfaces.Shape;
import learning.interfaces.ShapeFactory;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new RectangleImpl();
    }
}
