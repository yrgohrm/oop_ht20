import java.util.Scanner;

import games.BoringGame;
import games.interfaces.Game;
import games.GuessingGame;
import games.RpsGame;

public class App {
    public static void main(String[] args) {
        Game[] games = { new GuessingGame(), new RpsGame(), new BoringGame() };
        System.out.println("Vilket spel vill du spela?");
        for (int i = 0; i < games.length; ++i) {
            System.out.println((i+1) + ". " + games[i].getName());
        }
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        Game theGame;
        if (choice > 0 && choice <= games.length) {
            theGame = games[choice-1];

            theGame.play();
            System.out.println("Total score: " + theGame.totalScore());
        }

    }   
}