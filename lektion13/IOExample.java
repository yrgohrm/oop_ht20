import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IOExample {
    public static void main(String[] args) throws IOException {
        String inFile = args[0];
        String outFile = args[1];

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile, true));
             BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
            
            LocalDateTime time = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
            String timeString = time.format(format);

            writer.append(timeString);
            writer.newLine();
            writer.newLine();

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                writer.append(line);
                writer.newLine();
            }
        }

        System.out.println("Nu är det klart!");
    }
}
