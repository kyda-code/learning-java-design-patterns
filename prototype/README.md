# Java Prototype Pattern Example

This project provides a simple implementation of the Prototype creational design pattern in Java.

## Description

The Prototype Pattern is used when the cost of creating a new object is expensive or complex. Instead of creating
new objects, the prototype object is cloned. This example demonstrates this pattern by providing a `Copyable` interface
for creating copies of objects, and a `Prototype` class that implements this interface.

## Classes

The project includes the following classes/interfaces:

- `Copyable`: This is an interface that declares the `copy()` operation.
- `Prototype`: This class implements the `Copyable` interface and overrides the `copy()` method to return a copy of its own object.
- `Main`: This class demonstrates the use of the Prototype pattern by creating a new `Prototype` object, copying it, and then printing out the copied object.

## Usage

Compile and run the `Main.java` class. It will create a `Prototype` object, make a copy of it and output the copied object's details to the command line.


## Notes

Java has a `Cloneable` interface and the `Object.clone()` method for creating copies of objects. However, their usage is not as straightforward as the `Copyable` interface and requires understanding of deep and shallow copy concepts.