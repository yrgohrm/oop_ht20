package games.interfaces;

public interface LevelGame extends Game {
    int MAX_LEVEL = 100;
    int MIN_LEVEL = 1;

    void selectLevel(int level);
}
