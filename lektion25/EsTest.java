import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EsTest {
    public static void main(String[] args) {
        int cpus = Runtime.getRuntime().availableProcessors() + 1;
        ExecutorService service = Executors.newFixedThreadPool(cpus);

        for (int i = 0; i < 5; ++i) {

            service.submit(() -> {
                for (int j = 0; j < 5; ++j) {
                    sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            });

        }
        
        
        service.shutdown();
        System.out.println("Nu är det slut!");
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