package games.interfaces;

public interface Game {
    String getName();
    
    /**
     * Play a game ...
     */
    void play();

    /**
     * Returns the total score for the last game.
     * 
     * @return the total score
     */
    int totalScore();
}
