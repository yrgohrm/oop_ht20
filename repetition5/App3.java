public class App3 {
    public static void main(String[] args) {
        int apan = 22;
        Integer bepan = Integer.valueOf(19);
        try {
            metod1(apan, bepan);
            metod2();
            metod2();
            metod2();
            metod3();
        }
        catch (RuntimeException ex) {
            System.out.println("hehehe");

            throw ex;
        }
    }

    private static void metod1(int i, Integer j) {
        metod2();
    }

    private static void metod2() {
        metod3();
    }

    private static void metod3() {
        throw new RuntimeException("ajaj");
    }
}
