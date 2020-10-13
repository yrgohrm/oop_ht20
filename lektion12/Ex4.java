public class Ex4 {
    public static void main(String[] args) {
        try {
            doError();
            System.out.println("efter doError");
        }
        catch (IllegalArgumentException ex) {
            System.out.println("In catch");
        }
        finally {
            System.out.println("finally in main");
        }
    }

    private static void doError() {
        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException ex) {
            System.out.println("In catch");
        }
        finally {
            System.out.println("After try and catch");
        }
    }  
}
