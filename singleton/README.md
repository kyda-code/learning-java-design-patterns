# Singleton Design Pattern - Java Implementation

This project demonstrates the implementation of the Singleton design pattern in Java using two different approaches:

1. **Singleton with Double Check Locking**
2. **Singleton using Initialization-on-Demand Holder**

## Singleton with Double Check Locking

This implementation ensures that only one instance of the Singleton class exists in the Java Virtual Machine. This is achieved through a private static instance of the Singleton class and a public static method, `getInstance()`.

The `getInstance()` method provides a global point of access to the Singleton object and returns the instance to the caller. If the instance is null, which means it has not been instantiated yet, a Singleton object will be created. This method is thread-safe due to the existence of the synchronized block.

Refer to the class `Singleton` for the implementation.

## Singleton using Initialization-on-Demand Holder

This is a more advanced method for creating Singleton classes, which ensures thread-safeness, lazy initialization, and efficiency. A private static inner class, `Holder`, is used for this purpose.

The `Holder` class contains a static final instance of the SingletonHolder class, and it is instantly instantiated upon `Holder` class's class loading. The `Holder` class is not loaded until the `getInstance()` method is called, thus lazy initialization.

For the implementation, refer to the class `SingletonHolder`.

## How to use

To use either singleton, simply call the `getInstance()` method. For example:

`Singleton instance = Singleton.getInstance();`

`SingletonHolder instance = SingletonHolder.getInstance();`

## Note
These implementations ensure thread safety and are optimized for performance, but please remember to use the Singleton Pattern sparingly, as it acts on the global level and could create issues in unit testing, multi-threaded environments and scaling the software in the future.