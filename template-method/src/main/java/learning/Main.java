package learning;

public class Main {
    public static void main(String[] args) {
        Game game = new Chess();
        game.play();
        System.out.println();
        game = new Basketball();
        game.play();
    }
}
