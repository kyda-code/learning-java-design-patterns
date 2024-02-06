# State Pattern Demo in Java

This is a simple Java project demonstrating the usage of a State Design Pattern. The State Pattern provides a way to encapsulate an object's internal state and its behavior into separate classes. It allows an object to change its behavior when its internal state changes. Thus, it helps prevent conditional logic cluttering within the mainstream classes.

## Project Structure

The project consists of the following components:

- `State.java` - An interface representing the different states a context object can be in.
- `StartState.java` - A concrete state implementing the `State` interface, representing a "start" state.
- `StopState.java` - A concrete state implementing the `State` interface, representing a "stop" state.
- `Context.java` - The class that maintains a reference to a `State` object, which can be any state implementing the `State` interface.
- `Main.java` - The class that interacts with the `Context` object and see how its behavior change when its state changes.

## How to Implement

To use the State Pattern, you need to:

1. Create an interface (`State` in this project) that represents the different states an object can be in.
2. Create concrete state classes (`StartState` and `StopState` in this project) that implement the `State` interface. The behavior of the context object will change depending on which concrete state it is currently in.
3. Create a context class (`Context` in this project) that maintains a reference to a `State` object which is the current state of the context object.
4. The context object delegates its behavior to the `State` object.

## How to Run

To run this project, you need to:

1. Open the project in your preferred Java IDE.
2. Run the `Main` class.

You should see "Started" and then "Stopped" printed in the console. This output shows the change of state in the context object.
