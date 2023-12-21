package learning.factory;

/**
 * The AbstractFactory interface is a generic interface that represents a factory for creating objects of type T.
 */
public interface AbstractFactory<T> {
    T create(String type);
}