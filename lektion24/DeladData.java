import java.util.concurrent.ThreadLocalRandom;

public class DeladData {
    private static String text;

    private static class PrintRunner implements Runnable {
        public void run() {
            for (int i = 0; i < 200; ++i) {
                System.out.print(text + " ");
            }
        }
    }

    public static void main(String[] args) {
        text = "x";

        PrintRunner pr1 = new PrintRunner();
        PrintRunner pr2 = new PrintRunner();

        Thread t1 = new Thread(pr1);
        Thread t2 = new Thread(pr2);

        t1.start();
        t2.start();

        // här har vi tre trådar!!!
        // t1, t2, huvudtråden

        for (int i = 0; i < 200; ++i) {
            System.out.print("h ");
        }
    }
}