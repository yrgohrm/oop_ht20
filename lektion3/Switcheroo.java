import java.util.Scanner;

public class Switcheroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur många bilar äger du?");
        int numCars = scanner.nextInt();

        if (numCars < 0) {
            System.out.println("Nädu... inte ett vettigt antal bilar!");
            System.exit(0);
        }

        switch (numCars) {
            case 0:
                System.out.println("Du äger inga bilar.");
                //break;
            case 1:
            case 2:
                System.out.println("Ändå rätt normalt antal.");
                //break;
            case 3:
                System.out.println("Börjar bli många bilar...");
                //break;
            default:
                System.out.println("Du är lite av en samlare.");
        }
    }
}
