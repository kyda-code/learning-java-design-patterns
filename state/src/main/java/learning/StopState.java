package learning;

public class StopState implements State {
    public void handleRequest() {
        System.out.println("Stopped");
    }
}