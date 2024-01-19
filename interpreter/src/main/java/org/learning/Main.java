package org.learning;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create TerminalExpressions
        Expression isOne = new TerminalExpression("ONE");
        Expression isTwo = new TerminalExpression("TWO");

        // create AndExpression
        Expression oneAndTwo = new AndExpression(isOne, isTwo);

        // create OrExpression
        Expression oneOrTwo = new OrExpression(isOne, isTwo);

        // interpret method will return true or false based on AndExpression and OrExpression. It will interpret the context.
        System.out.println("ONE AND TWO expression is: " + oneAndTwo.interpret(new Context("ONE TWO")));
        System.out.println("ONE OR TWO expression is: " + oneOrTwo.interpret(new Context("THREE")));
    }
}