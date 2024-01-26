# Builder Pattern Implementation in Java

This project demonstrates a simple implementation of the Builder design pattern in Java.

## Classes in this project

1. **Car.java:** This class represents a simple Car object with basic properties: engine and color. It incorporates a nested static `Builder`
   class which has a fluent interface to set these properties and construct a Car instance.

2. **Main.java:** This class contains the main method which demonstrates the builder pattern implementation by constructing a Car object.

## Setup Instruction:

- Compile the java files:

```bash
javac Car.java Main.java
```
- Run the main class:

```bash
java Main 
```

## Expected Output:
Running the Main class should output:   
`Engine: V8 Engine, Color: Red`

## Design Pattern Used:

**Builder Design Pattern:** The builder design pattern is a creational design pattern which aims to "Separate the construction of a complex object from its representation so that the same construction process can create different representations." It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can create different representations of the same object.