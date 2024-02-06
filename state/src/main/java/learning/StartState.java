package learning;

public class StartState implements State {
    public void handleRequest() {
        System.out.println("Started");
    }
}
