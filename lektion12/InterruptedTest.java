public class InterruptedTest {
    public static void main(String[] args) {

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            // do nothing
        }

    }
}
