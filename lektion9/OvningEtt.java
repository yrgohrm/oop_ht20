import java.util.Scanner;

public class OvningEtt {
    private static int sum(int[] numbers) {
        int theSum = 0;
        for (int num : numbers) {
            theSum += num;
        }
        return theSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] someNums = new int[10];
        for (int i = 0; i < 10; ++i) {
            System.out.println("Skriv in ett tal:");
            int num = scan.nextInt();
            someNums[i] = num;
        }

        int theSum = sum(someNums);
        System.out.printf("Summan av alla tal blir %d%n", theSum);
    }
}