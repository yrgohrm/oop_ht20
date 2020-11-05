import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        //Instant i = Instant.now();
        // LocalDate d = LocalDate.of(2007, 10, 26);
        // LocalDate d2 = d.plusWeeks(7);

        // System.out.println(d.isBefore(d2));

        // LocalDateTime dt = LocalDateTime.now();

        ZoneId eur = ZoneId.of("Europe/Stockholm");
        ZonedDateTime zdt = ZonedDateTime.now(eur);

        // System.out.println(d);
        
        // System.out.println(i);
        // System.out.println(dt);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("hh:mm dd/MM yyyy");

        System.out.println(zdt.format(dateFormat));
    }
}