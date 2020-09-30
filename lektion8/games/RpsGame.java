package games;

import games.interfaces.LevelGame;

public class RpsGame implements LevelGame {

    public void play() {
        System.out.println("spela rps");

    }

    public int totalScore() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void selectLevel(int level) {
        if (level > MAX_LEVEL) {

        }
    }

    public String getName() {
        return "Sten/sax/pase";
    }
}
