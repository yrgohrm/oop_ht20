import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileInputControl implements InputControl, Serializable, AutoCloseable {
    private static final long serialVersionUID = 1232323L;

    @Override
    public int getValue() {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("text.txt"))) {
            String data = reader.readLine();
            return Integer.valueOf(data);
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void close() throws Exception {

    }
}
