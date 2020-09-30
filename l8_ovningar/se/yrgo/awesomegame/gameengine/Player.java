package se.yrgo.awesomegame.gameengine;

public class Player {
    private String name;
    private int lifePoints;

    public Player(String name) {
        this.name = name;
        this.lifePoints = 10;
    }

    public String getName() {
        return name;
    }

    public void damage(int point) {
        this.lifePoints -= point;
        if (this.lifePoints < 0) {
            System.out.println("Du dog...");
        }
    }
}
