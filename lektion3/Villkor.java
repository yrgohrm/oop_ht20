import java.util.Scanner;

public class Villkor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        System.out.println("Gillar du glass?");
        String iceAnswer = scanner.next();

        if (age < 13 && iceAnswer.equals("ja")) {
            System.out.println("Här, du får en glass.");
        }
        else if (age > 90) {
            System.out.println("Du får en glass ändå...");
            System.out.println("Du får en glass ändå...");
            System.out.println("Du får en glass ändå...");
        }
        else {
            System.out.println("Jahaja.");
        }
    }
}
