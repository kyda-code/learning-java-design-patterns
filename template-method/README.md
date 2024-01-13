# Learning the Template Method Design Pattern with Java

This module is a part of a larger project, aiming for understanding different Design Patterns in Java. The focus here is on the Template Method design pattern.

## Template Method

The Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

In other words, it allows us to define the 'template' of an algorithm, while letting subclasses implement specific steps.

## Implementation

This module includes several Java classes that show how to implement the Template Method pattern:

- `Game.java`: An abstract class that includes the template method `play()` and abstract methods `initialize()`, `startPlay()`, `endPlay()`.

- `Chess.java` and `Basketball.java`: These are concrete classes that extend `Game` and provide specific implementations for its abstract methods.

## Running the Examples

Each class has a `main` method which you can run separately. It's pretty straightforward if you are using an IDE, just open the class file and run the `main` method.

For running from the command line, navigate to the `src` directory and compile the classes first:

`cd template-method/src javac Game.java Chess.java Basketball.java`

Then run the main method of each class like so:

`java Chess java Basketball`

## Requirements

- OpenJDK 21