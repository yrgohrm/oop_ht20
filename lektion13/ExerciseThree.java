import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExerciseThree {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        Path theFile = FileSystems.getDefault().getPath(fileName);
        if (!Files.exists(theFile)) {
            System.out.println("Filen finns inte! " + fileName);
            System.exit(-1);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Filen finns inte: " + ex.getMessage());
        }
    }    
}
