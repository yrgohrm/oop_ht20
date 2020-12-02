import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: prog infile outfile");
            System.exit(-1);
        }

        Map<String, Integer> wordCount = new HashMap<>();

        try {
            Path inFile = Path.of(args[0]);
            Path outFile = Path.of(args[1]);

            checkFiles(inFile, outFile);

            readFile(inFile, wordCount);

            writeFile(outFile, inFile, wordCount);

        } catch (IOException ex) {
            System.out.println("I/O fel: " + ex.getMessage());
            System.exit(-1);
        } catch (InvalidPathException ex) {
            System.out.println("Filnamnen är inte korrekta: " + ex.getMessage());
            System.exit(-1);
        }

    }

    private static void writeFile(Path outFile, Path inFile, Map<String, Integer> wordCount) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(outFile, StandardCharsets.UTF_8)) {
            inFile = inFile.toAbsolutePath().normalize();
            writer.write(String.format("Filename: %s%n", inFile.toString()));

            LocalDateTime dt = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:dd");
            writer.write(String.format("Date: %s%n", formatter.format(dt)));

            int totalWords = 0;
            int uniqueWords = 0;
            for (int count : wordCount.values()) {
                totalWords += count;
                if (count == 1) {
                    uniqueWords++;
                }
            }

            writer.write(String.format("Words processed: %d%n", totalWords));
            writer.write(String.format("Total unique words: %d%n", uniqueWords));
        }
    }

    private static void readFile(Path inFile, Map<String, Integer> wordCount) throws IOException {
        try (Stream<String> lines = Files.lines(inFile, StandardCharsets.UTF_8)) {
            lines.flatMap(line -> {
                String[] words = line.split("\\s");
                return Arrays.stream(words);
            }).map(s -> s.replaceAll("[^\\p{IsAlphabetic}]", ""))
              .map(String::toLowerCase)
              .forEach(w -> addWordToMap(wordCount, w));
        }
        /*
        try (var reader = Files.newBufferedReader(inFile, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                for (String word : words) {

                }
            }
        }*/
    }

    private static void addWordToMap(Map<String, Integer> wordMap, String word) {
        int count = wordMap.getOrDefault(word, 0);
        wordMap.put(word, count + 1);
    }

    private static void checkFiles(Path inFile, Path outFile) {
        if (!Files.isReadable(inFile)) {
            System.out.println("Filen " + inFile + " är inte läsbar!");
            System.exit(-1);
        }

        if (Files.exists(outFile)) {
            System.out.println("Filen " + outFile + " finns redan!");
            System.exit(-1);
        }
    }
}
