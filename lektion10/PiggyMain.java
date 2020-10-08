import java.util.Scanner;

public class PiggyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PiggyBank pig = new PiggyBank();

        int theCoin;
        do {
            System.out.println("Skriv in ett mynt att spara:");
            theCoin = scan.nextInt();
            pig.addCoin(theCoin);
        } while (theCoin != 0);

        pig.addCoin(10);

        System.out.printf("Du har sparat %d mynt till ett totalt värde av %d kronor.",
                          pig.getNumberOfCoins(), pig.getTotalValue());
    }
}
