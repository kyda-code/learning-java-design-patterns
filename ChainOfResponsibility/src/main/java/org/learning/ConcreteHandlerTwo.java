package org.learning;

public class ConcreteHandlerTwo extends Handler {
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandlerTwo is handling the request: " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
