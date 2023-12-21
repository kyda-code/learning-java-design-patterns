package learning.interfaces;

/**
 * The ShapeFactory interface represents a factory for creating different shapes.
 * Implementations of this interface should provide the {@code createShape()} method,
 * which returns an instance of a Shape.
 */
public interface ShapeFactory {
    Shape createShape();
}
