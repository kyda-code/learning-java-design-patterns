package learning;

public class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Game Chess Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Chess Game Finished!");
    }
}
