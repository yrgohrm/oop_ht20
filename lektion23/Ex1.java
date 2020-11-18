import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        final Locale locale = Locale.UK;

        double[] numbers = new double[3];

        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(locale);

            for (int i = 0; i < numbers.length; ++i) {
                System.out.println("Skriv in ett tal:");
                numbers[i] = scan.nextDouble();
            }
        }

        double mean = Arrays.stream(numbers).map(sum -> sum / numbers.length).sum();

        System.out.printf(locale, "Medelvärder är %.3f.%n", mean);
    }
}
