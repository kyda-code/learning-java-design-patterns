# Java Iterator Pattern Demo Project

This project demonstrates the Iterator Design Pattern using a simple example of iterating over a collection of names.

## Classes

### Iterator

This interface defines the methods that must be implemented by any class that wants to be an iterator.

### Container

This interface defines a method for returning an iterator.

### NameRepository

This class implements the Container interface. It maintains a collection of names and provides an iterator (NameIterator) to iterate over this collection.

### NameIterator

This is an inner class of NameRepository and implements the Iterator interface. It provides mechanisms to iterate over the collection of names.

### IteratorPatternDemo

This is the driver class which uses the NameRepository to get an iterator and print the names.

## Running the Project

1. Compile all the java files: `javac *.java`
2. Run the main class file: `java IteratorPatternDemo`

You should see the following output, which is the list of names defined in the NameRepository:

`Name : John Name : Alice Name : Bob Name : Sara`

