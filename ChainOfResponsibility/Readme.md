# Chain of Responsibility Design Pattern Project

This project demonstrates the use of the Chain of Responsibility design pattern.

## Project Structure

The project contains the following classes:

- **Handler**: This is the abstract parent class for all handlers. It provides an interface for handling the requests and maintaining the successor (the next handler in the chain).

- **ConcreteHandlerOne and ConcreteHandlerTwo**: These are the concrete implementations of the Handler class that handle the request based on specific conditions. If they can't handle the request, they use the successor to pass the responsibility to the next handler in the chain.

- **Main**: This class contains the main method and is responsible for initiating the requests and the setup of handler chain.

## Execution Result

When you run the `Main` class, you should get the following output:

ConcreteHandlerOne is handling the request: 2  
ConcreteHandlerOne is handling the request: 5  
ConcreteHandlerTwo is handling the request: 14  
ConcreteHandlerTwo is handling the request: 18  
ConcreteHandlerOne is handling the request: 3  

This output indicates which handler processed each request.

## Understanding Chain of Responsibility

The Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

In this project setup, `Handler` serves as an abstraction for what constitutes a 'handler'. `ConcreteHandlerOne` and `ConcreteHandlerTwo` are the specific handlers that know how to handle specific requests. They also know who the next handler is, in case they can't handle a request, thus forming the 'chain of responsibility'.