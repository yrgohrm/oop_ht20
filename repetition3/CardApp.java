public class CardApp {
    public static void main(String[] args) {
        
        try {
            ett();
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Feeeel! " + ex.getMessage());
        }

        System.out.println("efter catch");
    }

    static void ett() {
        tva();
        System.out.println("slutet av ett");
    }

    static void tva() {
        Card c = new Card(14);
        System.out.println("slutet av två " + c);
    }
}
