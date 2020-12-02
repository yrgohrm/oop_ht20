import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppEx3 {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.add(new Computer("arduino", 0.016, 0, 0));
        computers.add(new Computer("rpi4", 1.5, 4096, 32000));
        computers.add(new Computer("picard3", 3.2, 32*1024, 1000 * 1000));
        computers.add(new Computer("picard2", 3.2, 16*1024, 2 * 1000 * 1000));
        computers.add(new Computer("picard", 3.2, 32*1024, 2 * 1000 * 1000));
        
        Collections.sort(computers);

        for (Computer computer : computers) {
            System.out.println(computer);
        }

        System.out.println("\n----\n");

        var comp = Comparator.comparing(Computer::getHdd);
        Collections.sort(computers, comp);

        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
