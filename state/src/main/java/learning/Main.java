package learning;

public class Main {
    public static void main(String [] args){
        Context context = new Context();

        StartState startState = new StartState();
        context.setState(startState);
        context.applyState();

        StopState stopState = new StopState();
        context.setState(stopState);
        context.applyState();
    }
}