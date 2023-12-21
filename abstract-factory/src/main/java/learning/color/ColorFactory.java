package learning.color;

import learning.color.impl.Blue;
import learning.color.impl.Red;
import learning.factory.AbstractFactory;

/**
 * The ColorFactory class is an implementation of the AbstractFactory interface.
 * It is responsible for creating instances of the Color interface based on the given type.
 */
public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if ("Red".equalsIgnoreCase(type)) {
            return new Red();
        } else if ("Blue".equalsIgnoreCase(type)) {
            return new Blue();
        }
        return null;
    }
}