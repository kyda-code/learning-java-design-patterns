package org.learning;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Handler one = new ConcreteHandlerOne();
        Handler two = new ConcreteHandlerTwo();

        one.setSuccessor(two);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            one.handleRequest(request);
        }
    }
}