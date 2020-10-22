import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Integer tal = 2;
        Integer annatTal = 2;

        Integer stortTal = 22222;
        Integer annatStortTal = 22222;

        System.out.println((tal == annatTal) + " " + (stortTal == annatStortTal));
    }

    /**
     * @throws RuntimeException when stuff is X
     */
    public void doStuff() {

        throw new RuntimeException("det gick snett");
    }
}