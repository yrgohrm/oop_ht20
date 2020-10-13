public class Ex2 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Oops, det gick illa: "
                               + ex.getMessage());
        }
    }
}
