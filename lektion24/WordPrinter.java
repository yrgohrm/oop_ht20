public class WordPrinter implements Runnable {
    private final String message;

    public WordPrinter(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 1000; ++i) {
            System.out.printf("%s ", message);
        }
    }
}
