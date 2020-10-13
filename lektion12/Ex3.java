public class Ex3 {
    private static void whatWillItDo() {
        //throw new UnsupportedOperationException("don’t");
        throw new ArrayIndexOutOfBoundsException("don’t");
    }

    public static void main(String[] args) {
        try {
            whatWillItDo();
        }
        catch (ArrayIndexOutOfBoundsException
               | NullPointerException ex) {
            System.err.println("Oops, det gick illa!");
        }
        catch (Exception ex) { // catches almost anything
            System.err.println("Got to catch em all.");
        }
    }
}
