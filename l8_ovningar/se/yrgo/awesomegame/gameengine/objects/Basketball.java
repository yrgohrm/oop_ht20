package se.yrgo.awesomegame.gameengine.objects;

import se.yrgo.awesomegame.gameengine.Player;

public class Basketball implements Interactive {
    private int usages = 3;

    public void interact(Player player) {
        if (usages <= 0) {
            System.out.println("Den är dåligt pumpad...");
        }
        else {
            usages--;
            System.out.println("Du studsar lite med bollen");
        }
    }

    public String getName() {
        return "en basketboll";
    }
}
