public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new WordPrinter("Hello"));
        t1.start();

        Runnable world = new WordPrinter("World");
        world.run();

        t1.join();

        System.out.println("Time to quit!");
    }
}
