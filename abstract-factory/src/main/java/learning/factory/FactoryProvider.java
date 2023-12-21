package learning.factory;

import learning.color.ColorFactory;
import learning.shape.ShapeFactory;

/**
 * The FactoryProvider class provides a static method to get a factory based on the provided type.
 * It returns an instance of AbstractFactory which can be used to create objects of a specific type.
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String type) {
        if ("Color".equalsIgnoreCase(type)) {
            return new ColorFactory();
        } else if ("Shape".equalsIgnoreCase(type)) {
            return new ShapeFactory();
        }
        return null;
    }
}