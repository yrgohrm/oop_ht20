package se.yrgo.awesomegame.gameengine.objects;

import se.yrgo.awesomegame.gameengine.Player;

public class Horse implements Interactive {
    public void interact(Player player) {
        System.out.println("Hästen biter dig!");
        player.damage(2);
    }

    public String getName() {
        return "en snel hest";
    }
}
