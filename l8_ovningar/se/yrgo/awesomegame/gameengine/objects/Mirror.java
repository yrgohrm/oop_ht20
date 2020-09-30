package se.yrgo.awesomegame.gameengine.objects;

import se.yrgo.awesomegame.gameengine.Player;

public class Mirror implements Interactive {
    public void interact(Player p) {
        System.out.printf("Du ser %s i spegeln.%n", p.getName());
    }

    public String getName() {
        return "en spegel";
    }
}
