package games;

import java.util.concurrent.ThreadLocalRandom;

import games.interfaces.Game;

public class GuessingGame implements Game {
    private int number;
    private int guesses;

    public GuessingGame() {
        number = ThreadLocalRandom.current().nextInt(10);
        guesses = 0;
    }

    public void play() {
        System.out.println("spela gissningsleken");
    }

    public int totalScore() {
        return guesses;
    }

    public void doStuff() {}

    public String getName() {
        return "Gissningsleken";
    }
}
