package games;

import games.interfaces.Game;

public class BoringGame implements Game {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Det tråkiga spelet";
    }

    @Override
    public void play() {
        System.out.println("trååkigt");
    }

    @Override
    public int totalScore() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
