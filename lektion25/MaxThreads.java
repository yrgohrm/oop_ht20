import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MaxThreads {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService serv = Executors.newCachedThreadPool();

        int count = 0;
        while (true) {
            serv.submit(() -> {
                sleep(1000000);
            });
            System.out.println(++count);
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
