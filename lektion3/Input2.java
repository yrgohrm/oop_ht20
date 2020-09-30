import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Vad heter du?");
            String name = scanner.nextLine();      

            System.out.printf("Hej %s!", name);
        }
    }
}
