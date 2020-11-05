import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        //LocalDate inAmonth = today.plusMonths(1);
        LocalDate inAmonth = today.plus(1, ChronoUnit.MONTHS);

        System.out.println(inAmonth.format(DateTimeFormatter.ISO_DATE));
    }
}
