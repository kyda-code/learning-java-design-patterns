# Java Mediator Pattern - Chat Room Example

This project demonstrates the implementation of the Mediator design pattern in Java. The problem context is a simple chat room where multiple `User` objects can send and receive messages.

## Implementation

The classes involved in this project are `ChatRoom` (Mediator), `User` (Colleague), and a `Main` class to run the program.

### Mediator - ChatRoom Class

`ChatRoom` is the Mediator class that mediates the communication between different `User` objects. It maintains a list of `User` objects and broadcasts a message to all users when one user sends a message.

### Colleague - User Class

Each `User` represents a participant in the chat room. It can send and receive messages, but it communicates indirectly, through the `ChatRoom`.

When a `User` sends a message, it notifies the `ChatRoom`, and the `ChatRoom` takes care of distributing the message to all other `User` objects.

When the `ChatRoom` distributes messages, it invokes the `receive` method on each `User` object.

### Main Class

The `Main` class creates a `ChatRoom`, adds the `Users`, and simulates a conversation between them.

## Running the Program

To run the program, compile and run the `Main` class. This will simulate a conversation between two users, denoted as "Alice" and "Bob".

As an output, you will see messages sent and received by `User` instances.

## Conclusion

This project is a simple example of the Mediator pattern in Java. Communication between `User` objects is encapsulated in the `ChatRoom` mediator. This makes it easy to add and manage `User` objects independently, keeping them loosely coupled.