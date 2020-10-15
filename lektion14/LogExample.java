import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample {
    final static Logger logger =
                    LoggerFactory.getLogger(LogExample.class);

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            logger.info("Användaren skall välja en glass.");
            System.out.println("Vilken glass vill du ha? 0-2");
            int choice = scan.nextInt();
            logger.info("Användaren valde glass {}", choice);
            String[] iceCreams = { "Nogger", "88:an", "Piggelin" };
            if (choice < 0 || choice >= iceCreams.length) {
                logger.info("Användaren valde utanför gränserna.");
                System.out.println("Du får ingen glass!");
            }
            else {
                System.out.println("Din glass: " + iceCreams[choice]);
            }
        }
        catch (RuntimeException ex) {
            logger.error("Allt har gått åt helvete", ex);
            System.out.println("Du skrev en dum siffra");
        }
    }
}
