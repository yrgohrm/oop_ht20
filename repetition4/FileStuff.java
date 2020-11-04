import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class FileStuff {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> counters = new TreeMap<>();
        try (Stream<String> theFile = Files.lines(Path.of("apa.txt"))) {
            theFile.map(String::toLowerCase).forEach(line -> {
                for (char c : line.toCharArray()) {
                    Integer i = counters.get(c);
                    if (i == null) {
                        counters.put(c, 1);
                    } else {
                        counters.put(c, i + 1);
                    }
                }
            });
        }

        for (Map.Entry<Character, Integer> entry : counters.entrySet()) {
            System.out.printf("'%c': %d%n", entry.getKey(), entry.getValue());
        }
    }
}
