package learning;

public class Basketball extends Game {

    @Override
    void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Game Basketball Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}
