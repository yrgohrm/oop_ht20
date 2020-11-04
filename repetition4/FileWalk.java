import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWalk {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Gör rätt...");
            System.exit(-1);
        }

        String thePath = args[0];
        final String ending = args[1];
        Files.walk(Path.of(thePath))
             .filter(f -> f.toString().endsWith(ending))
             .map(Path::toAbsolutePath)
             .map(Path::normalize)
             .forEach(System.out::println);
    }
}
