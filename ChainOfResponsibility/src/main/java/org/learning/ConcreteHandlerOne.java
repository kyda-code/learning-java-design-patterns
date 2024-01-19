package org.learning;

public class ConcreteHandlerOne extends Handler {
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandlerOne is handling the request: " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}