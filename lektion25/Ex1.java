import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 5; ++i) {
            final int name = i;
            service.submit(() -> {
                for (int j = 0; j < 50; ++j) {
                    System.out.println(j + "_" + name);
                }
            });
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("slut");
    }
}
