import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SomeThreads {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService serv = Executors.newCachedThreadPool();

        int count = 0;
        for (int i = 0; i < 30; ++i) {
            serv.submit(() -> {
                sleep(5000);
                for (int j = 0; j<1000000;++j) {
                    if (j%10000 == 0) {
                        System.out.print(".");
                    }
                }
                sleep(15000);
            });
            System.out.println(++count);
        }

        serv.shutdown();
        serv.awaitTermination(1, TimeUnit.MINUTES);
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
