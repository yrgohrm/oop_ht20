import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex1Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(3344)) {
            try (Socket client = server.accept();
                 DataInputStream dataIn = new DataInputStream(client.getInputStream());
                 DataOutputStream dataOut = new DataOutputStream(client.getOutputStream())) {

                int clientInt = dataIn.readInt();
                dataOut.writeInt(clientInt+1);
                dataOut.flush();

                System.out.println("Klient-int: " + clientInt);
            }
        }
        catch (IOException ex) {
            System.err.println("Det sket sig: " + ex.getMessage());
        }
    }
}
