import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex3 {
    public static void main(String[] args) {
        /*
        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        } */

        ZoneId gbgZone = ZoneId.of("Europe/Stockholm");
        ZonedDateTime gothenburg = ZonedDateTime.now(gbgZone);

        ZoneId nyZone = ZoneId.of("America/New_York");
        //ZoneId nyZone = ZoneId.of("UTC-5"); // not so good
        //ZonedDateTime ny = ZonedDateTime.now(nyZone);
        ZonedDateTime ny = gothenburg.withZoneSameInstant(nyZone);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(gothenburg.format(format));
        System.out.println(ny.format(format));

        
    }
}
