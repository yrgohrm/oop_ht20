import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    private int secretNumber;
    private int madeGuesses;

    public GuessingGame() {
        secretNumber = ThreadLocalRandom.current().nextInt(10) + 1;
        madeGuesses = 0;
    }

    /**
     * Make a guess of the secret number.
     * 
     * @return 0 if they are the same, -1 if the guess is less and 1 otherwise
     */
    public GuessResult guess(int theGuess) {
        madeGuesses++;
        if (theGuess == secretNumber) {
            return GuessResult.CORRECT;
        }
        else if (theGuess < secretNumber) {
            return GuessResult.TOO_LOW;
        }
        else {
            return GuessResult.TOO_HIGH;
        }
    }

    public int getMadeGuesses() {
        return madeGuesses;
    }
}
