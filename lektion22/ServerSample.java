import java.net.ServerSocket;
import java.net.Socket;

public class ServerSample {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(12345)) {
            while (true) {
                Socket client = server.accept();
                handleInThread(client);
            }
        }
    }
}
