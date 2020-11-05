import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        LocalDate date = null;
        LocalDate now = LocalDate.now();

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Skriv in födelsedatum (yyyy-mm-dd):");
                String dateString = scan.nextLine();

                try {
                    date = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE);
                    if (date.isBefore(now)) {
                        break;
                    }

                    System.out.println("Inga framtidsdatum, tack.");
                }
                catch (DateTimeParseException ex) {
                    System.out.println("Hörrö du, det funkar inte. " + ex.getMessage());
                }
            }
        }

        long days = ChronoUnit.DAYS.between(date, now);
        System.out.printf("Du är %d dagar gammal.%n", days);
    }
}
