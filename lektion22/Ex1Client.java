import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 3344);
             DataInputStream dataIn = new DataInputStream(socket.getInputStream());
             DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream())) {
            int random = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            dataOut.writeInt(random);
            dataOut.flush();
            int answer = dataIn.readInt();

            if (answer == random+1) {
                System.out.println("Success!");
            }
            else {
                System.out.println("Failure!");
            }
        }
        catch (IOException ex) {
            System.err.println("Det blev inte så bra: " + ex.getMessage());
        }
    }
}
