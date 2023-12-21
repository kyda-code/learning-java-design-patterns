# Abstract Factory Design Pattern in Java

This project demonstrates how to implement Abstract Factory Design Pattern in Java.

## Project Structure

The project is divided into the following packages:

- __learning.factory__
    - AbstractFactory.java
    - FactoryProvider.java
    - __color__
        - Color.java
        - ColorFactory.java
        - __impl__
            - Red.java
            - Blue.java
    - __shape__
        - Shape.java
        - ShapeFactory.java
        - __impl__
            - Circle.java
            - Rectangle.java
- __learning__
    - MainApp.java

The 'factory' package contains the AbstractFactory interface and the FactoryProvider class, which produces factories for us.

The 'color' and 'shape' packages contain interfaces (Color and Shape) and corresponding concrete factories (ColorFactory and ShapeFactory) with their specific implementations in 'impl' package.

The 'main' package contains the MainApp.java class which serves as the entry point to the application.

## Running the Project

To run the project, simply navigate to the 'learning' package and execute the `MainApp.java` class.

## Output

The output of the application should be something similar to the following:

Drawing a circle shape... 

Filling with red color...

Please note that you might want to handle null checks or add error handling depending upon your use case.