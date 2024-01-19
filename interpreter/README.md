# Interpreter Pattern in Java

The Interpreter design pattern provides a way to evaluate language grammar or expression. It's commonly used for building a compiler or parsing data. This project demonstrates a simple implementation of the Interpreter pattern using Java 21.

## Project Structure

The project is divided into several Java files:

- `Context.java`: This class contains the tokenizer that has methods for tokenization of the given text.

- `Expression.java`: An interface that all classes in our expression hierarchy will implement. Each such class will implement the `interpret` method that interprets a context.

- `TerminalExpression.java`: A class that interprets the `Context` based on its literal.

- `AndExpression.java`: A class that interprets the `Context` based on `AND` operation of their expression fields.

- `OrExpression.java`: A class that interprets the `Context` based on `OR` operation of their expression fields.

- `Main.java`: The main driver program. This class makes use of the other classes to interpret string inputs.

## Execution Result

When you run the `Main.java`, it will output:

ONE AND TWO expression is: true ONE OR TWO expression is: false

The first print statement is the result of interpreting the string "ONE TWO" with an `AND` operation - it checks if both "ONE" and "TWO" are present in the string which is true.

The second print statement is the result of interpreting the string "THREE" with an `OR` operation - it checks if either "ONE" or "TWO" is present in the single word string. As none of them are present, the result is false.

## Setup and Running

To compile and run the project:

1. Ensure you have JDK 21+ installed, set your JAVA_HOME, and added java to your path.

2. Open a terminal/command prompt and navigate to the directory containing the .java files.

3. Compile all the java files using the command `javac *.java`.

4. Run the `Main` class using the command `java Main`.

Please make sure that all these java files are in the same package or imported as per requirements, as they are dependent on each other.