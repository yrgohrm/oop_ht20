import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) throws IOException {
        String inFile = args[0];
        String outFile = args[1];

        // check existance is left as an exercise for the reader

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile))) {
            
            while (true) {
                byte[] data = new byte[4096];
                int size = in.read(data);
                if (size == -1) {
                    break;
                }
                out.write(data, 0, size);
            }
        }
    }
}
