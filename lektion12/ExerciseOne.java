import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            System.out.println("Skriv in ett tal:");
            int number = scan.nextInt();
            if (number > 10) {
                throw new IllegalArgumentException("under tio");
            }
            else if (number < 0) {
                throw new RuntimeException("bra felmeddelande");
            }
            
            System.out.println(number);
        }
        catch (IllegalArgumentException ex) {
            System.out.println("iea: " + ex.getMessage());
        }
        catch (RuntimeException ex) {
            System.out.println("re: " + ex.getMessage());
        }
        finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
