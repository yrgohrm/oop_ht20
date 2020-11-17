import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("en-GB");
        
        
        ResourceBundle bundle = ResourceBundle.getBundle("resources/test", locale);


        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodbye"));
    }
}