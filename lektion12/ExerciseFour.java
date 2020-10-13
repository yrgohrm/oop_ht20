import java.util.Scanner;

public class ExerciseFour {
    private static void doStuff() throws BosseDoneGofedException {
        try {
            someOtherMethod();
        }
        catch (RuntimeException ex) {
            throw new BosseDoneGofedException("ett fel har inträffat", ex);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int num = scan.nextInt();

            if (num > 10) {
                doStuff();
            }
            else {
                doStuff();
            }
        }
        catch (BosseDoneGofedException ex) {
            ex.printStackTrace();
        }
    }
}
