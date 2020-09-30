package se.yrgo.awesomegame;

import java.util.Scanner;
import se.yrgo.awesomegame.gameengine.Player;
import se.yrgo.awesomegame.gameengine.objects.Basketball;
import se.yrgo.awesomegame.gameengine.objects.Horse;
import se.yrgo.awesomegame.gameengine.objects.Interactive;
import se.yrgo.awesomegame.gameengine.objects.Mirror;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player("Jane Doe");
        Interactive[] things = { new Horse(), new Mirror(), new Basketball() };

        System.out.println("Du ser: ");
        for (Interactive thing : things) {
            System.out.println(thing.getName());
        }

        String answer;
        do {
            System.out.println("Vad vill du använda?");
            answer = scan.nextLine();
            answer = answer.trim();

            for (Interactive thing : things) {
                if (answer.equals(thing.getName())) {
                    thing.interact(player1);
                    break;
                }
            }
        } while (!"avsluta".equals(answer));
    }
}