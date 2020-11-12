import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Ex2Client {
    public static void main(String[] args) {
        final String domain = args[0];
        final String request = String.format("GET / HTTP/1.1\nHost: %s\nConnection: close\n\n", domain);

        try (Socket socket = new Socket(domain, 80);
             InputStream is = socket.getInputStream();
             OutputStream os = socket.getOutputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(is));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {
                 
            writer.write(request);
            writer.flush();

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ex) {
            System.err.println("Det blev inte så bra: " + ex.getMessage());
        }
    }
}
