import java.io.IOException;

public class Ex5_2 {
    private static void throwChecked() throws IOException {
        throw new IOException();
    }

    private static void doStuff() throws IOException {
        throwChecked();
    }

    public static void main(String[] args) {
        try {
            doStuff();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
