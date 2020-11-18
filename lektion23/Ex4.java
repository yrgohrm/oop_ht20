import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        final Locale locale = Locale.forLanguageTag("sv-SE");
        final ResourceBundle bundle = ResourceBundle.getBundle("ex4", locale);

        double[] numbers = new double[3];

        try (Scanner scan = new Scanner(System.in)) {
            scan.useLocale(locale);

            for (int i = 0; i < numbers.length; ++i) {
                System.out.println(bundle.getString("enterNumber"));
                numbers[i] = scan.nextDouble();
            }
        }

        double mean = Arrays.stream(numbers).map(sum -> sum / numbers.length).sum();

        System.out.printf(locale, bundle.getString("mean"), mean);
    }
}
