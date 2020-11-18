import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex5 {
    public static void main(String[] args) {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("u8fil.txt"), StandardCharsets.UTF_8)) {
            bw.write("\u2661\u2665\u2661");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
