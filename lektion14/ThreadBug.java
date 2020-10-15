import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadBug {
    private List<String> lOne = new ArrayList<String>();
    private List<String> lTwo = new ArrayList<String>();

    private class Sync1 implements Runnable {
        @Override
        public void run() {
            System.out.println("Start!");

            synchronized (lOne) {
                sleep();
                synchronized (lTwo) {
                    lOne.add("hej");
                    lTwo.add("hej");
                }
            }

            System.out.println("It's done");
        }
    }

    private class Sync2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Start!");

            synchronized (lTwo) {
                sleep();
                synchronized (lOne) {
                    lOne.add("hej");
                    lTwo.add("hej");
                }
            }

            System.out.println("It's done");
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public ThreadBug() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new Sync1());
        service.submit(new Sync2());
        service.shutdown();
    }

    public static void main(String[] args) {
        new ThreadBug();
    }
}
