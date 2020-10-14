import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileComp {
    public static void main(String[] args) throws IOException {
        try (BufferedReader f1 = new BufferedReader(new FileReader("file.txt"));
                BufferedReader f2 = new BufferedReader(new FileReader("other.txt"))) {
            String f1Line, f2Line;
            while (true) {
                f1Line = f1.readLine();
                f2Line = f2.readLine();
                if (f1Line == null && f2Line == null) {
                    // both files end at the same time
                    break;
                } else if (f1Line == null || f2Line == null || !f1Line.equals(f2Line)) {
                    System.out.println("Not a match");
                    break;
                }
            }
        }
    }
}
