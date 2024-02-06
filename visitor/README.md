# Visitor Pattern Java Implementation

This Java project illustrates the usage of the Visitor Design Pattern.

## Description

The project depicts a simple example of a school with a set of students and a visitor (a SchoolVisitor) who calculates the total marks and average marks of the students.

We have the following key components in this example:

- **Student**: Represents an element that will be visited. Each student object holds the name and marks of a student. It also provides an `accept` method which accepts a `StudentVisitor`.

- **StudentVisitor**: An interface representing a visitor that will visit `Student` objects. It has a `visit` method which classes implementing `StudentVisitor` must define.

- **SchoolVisitor**: A concrete class that implements `StudentVisitor`. It will visit `Student` objects and calculate the total and average marks of the students.

## How to run the Project

The `Main.java` file illustrates the usage of the Visitor Pattern.

`javac Main.java java Main`

In this project, every `Student` is visited by a `SchoolVisitor`, which calculates the total and average marks for the students.
