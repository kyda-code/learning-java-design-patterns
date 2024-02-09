# Memento Pattern - Java Implementation

This is a simple Java application implementing the Memento design pattern.

## Table of Contents

1. [About](#about)
2. [Structure](#structure)
3. [Running the Application](#running-the-application)
4. [Wrap Up](#wrap-up)

## About

The Memento design pattern is used to restore the state of an object back to its previous state. It's especially useful in applications that need to provide an 'undo' function.

In our project, there are three classes:

1. `Article` (Originator): the class of objects for which states need to be saved and restored.
2. `ArticleMemento` (Memento): the class of objects representing the states of the Originator.
3. `ArticleHistory` (Caretaker): the class that keeps track of the history of states.

## Structure

The application is divided into three classes which interact with each other:

1. `Main.java` : Demonstrates the functionality of the Memento Pattern. It creates an Article, changes its state, and restores it back.
2. `Article.java` : Includes methods for setting and retrieving the state of the article, and creating the memento object that will save the state.
3. `ArticleMemento.java` : Contains the same fields as the article and represents a given state of the Article.
4. `ArticleHistory.java` : Stores the article mementos and provides functionality to get them.

## Running the Application

To run the program, run the following command:

`javac Main.java && java Main`

This command compiles and runs the `Main.java` file, which has the main method.

## Wrap Up

This project is a simple yet comprehensive demonstration of how to implement and make use of the Memento design pattern in Java. Using this pattern can be very beneficial especially in applications where you need to provide a rollback or undo functionality.