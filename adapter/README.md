# Adapter Pattern Implementation

This project demonstrates a simple implementation of the Adapter Pattern used in software design. The program consists of a `Client.java`, `OldService.java`, `NewInterface.java` and `Adapter.java` file.

## Overview

The Adapter Pattern is a design pattern that translates the interface for one class into a compatible interface. The idea is to allow classes to work together that couldn't otherwise due to incompatible interfaces.

The project consists of four class files which implement this pattern:

1. **`OldService`**: This represents an old, pre-existing service we want to use that does not match the interface we need for our new code.

2. **`NewInterface`**: This is the interface that new requests are made on.

3. **`Adapter`**: The Adapter imitates the behavior of another class. This is the class that connects the `NewInterface` and `OldService`.

4. **`Client`**: This class represents new code/client which wants to use the new interface.

## Running the Program

Use a Java compiler to compile all four class files. The `main` method in `Client` class is the entry point to the program. Run this `main` method to run the entire program.

You will see this output:

`OldService runs oldRequest`

This line of output demonstrates that we have successfully used the `OldService` through the `Adapter`, while the `Client` interacted with the `NewInterface`.

Let me know if there's anything else you need help with in this project.