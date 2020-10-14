import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("aaafile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Filen fanns inte");
        }
        catch (IOException ex) {
            System.out.println("Oops det gick fel: " + ex.getMessage());
        }
    }
}
