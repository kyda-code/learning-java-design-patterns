package learning.factory;

import learning.CircleImpl;
import learning.interfaces.Shape;
import learning.interfaces.ShapeFactory;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new CircleImpl();
    }
}
