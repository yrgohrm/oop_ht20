import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1 {
    public static void main(String[] args) {
        Collection<String> names = new HashSet<>();

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Skriv in en tävlande:");
                String name = scan.nextLine();
                if (name.length() == 0) {
                    break;
                }

                if (!names.add(name.trim())) {
                    System.out.println("Du har redan en lott!");
                }
            }
        }

        int random = ThreadLocalRandom.current().nextInt(names.size());

        //String winner = names.toArray(new String[names.size()])[random];
        String winner = null;
        int count = 0;
        for (String name : names) {
            if (count == random) {
                winner = name;
                break;
            }
            count++;
        }

        System.out.println("Vinnaren: " + winner);
    }
}
