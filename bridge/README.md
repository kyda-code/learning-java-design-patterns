# Bridge Pattern Java Implementation

This project provides a simple implementation of the Bridge Design Pattern in Java.

## Project Structure

The project consists of the following classes:

- **CarType** - The `Implementor` Interface.
- **Sedan and SUV** - These are `ConcreteImplementor` classes implementing the `Implementor` interface.
- **Car** - This is the `Abstraction`.
- **CarInfo** - This class represents the `RefinedAbstraction` extending `Abstraction`.
- **Client** - This class uses the Bridge pattern.

## How it works

The `Client` creates `CarInfo` objects by injecting `CarType` (i.e., `Sedan` or `SUV`). The `Car` class does not need to know which `CarType` it is given, which is a demonstration of the decoupling of the abstraction and its implementation.

## Example

Here is how the pattern is used in the `Client`:

```
java public class Client { 
    public static void main(String[] args){ 
        CarType carType1 = new Sedan(); 
        Car car1 = new CarInfo(carType1); 
        car1.details();
        
        CarType carType2 = new SUV(); 
        Car car2 = new CarInfo(carType2); 
        car2.details(); }
}
```

Upon running this, it will display the details of the `CarType` of each `CarInfo` object, demonstrating the flexibility of the Bridge Pattern.

## Notes
This is a simple representation to illustrate the concept of a Bridge Pattern. In real-world projects, these classes might be more complex and could reside in different packages or modules.