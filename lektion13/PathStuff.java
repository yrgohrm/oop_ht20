import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathStuff {
    public static void main(String[] args) throws IOException {
        Path theFile = FileSystems.getDefault().getPath("mydir", "apa.txt");
        //Path theFile = FileSystems.getDefault().getPath("mydir\\apa.txt");
        if (!Files.exists(theFile)) {
            System.out.println("No such file exists!");
            System.exit(-1);
        }

        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(theFile.toFile()))) {
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toLowerCase());
            }
        }
    }
}
