import java.text.DateFormatSymbols;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        Locale deCH = Locale.forLanguageTag("de-CH");
        DateFormatSymbols chDateFormat = DateFormatSymbols.getInstance(deCH);

        for (String month : chDateFormat.getMonths()) {
            System.out.println(month);
        }
    }
}
