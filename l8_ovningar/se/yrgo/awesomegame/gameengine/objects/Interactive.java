package se.yrgo.awesomegame.gameengine.objects;

import se.yrgo.awesomegame.gameengine.Player;

public interface Interactive {
    void interact(Player player);
    String getName();
}
