import java.util.ArrayList;
import java.util.List;

public class ThreadEx3List {
    private static List<Integer> value = new ArrayList<>();
    private static List<Integer> value2 = new ArrayList<>();
    
    private static class BadStuff implements Runnable {
        public void run() {
            for (int i = 0; i < 10; ++i) {
                doIncrement();
            }
        }

        private void doIncrement() {
            System.out.println("hejsan hoppsan");
            System.out.println("hejsan hoppsan");

            synchronized (value) {
                value.add(value.size());
                if (value.size() % 2 == 0) {
                    System.out.println("The value is: " + value.size());
                    value.add(value.size());
                }
            }

            System.out.println("hejsan hoppsan");
            System.out.println("hejsan hoppsan");

            synchronized (value) {
                synchronized (value2) {
                    value2.add(value.size());
                    value.add(value2.size());
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BadStuff bs = new BadStuff();
        Thread t1 = new Thread(bs);
        Thread t2 = new Thread(bs);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println("Should be 50: " + value.size());
    }
}