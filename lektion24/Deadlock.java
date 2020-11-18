import java.util.ArrayList;
import java.util.List;

public class Deadlock {
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

    public Deadlock() throws InterruptedException {
        Thread t1 = new Thread(new Sync1());
        Thread t2 = new Thread(new Sync2());
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        new Deadlock();
    }
}
