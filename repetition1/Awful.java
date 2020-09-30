import java.util.concurrent.ThreadLocalRandom;

public class Awful {
    private static int randomD6() {
        return 1 + ThreadLocalRandom.current().nextInt(6);
    }

    public static void main(String[] args) {
        int die_one = randomD6();
        int die_two = randomD6();
        System.out.printf("You rolled %d and %d.\n", die_one, die_two);
        if (die_one == die_two) {
            System.out.printf("You rolled a pair!");
        } else if (die_one > 3 && die_two > 3) {
            System.out.printf("You are a high roller!");
        } else if (die_one < 4 && die_two < 4) {
            System.out.printf("Boo! You rolls are bad.");
        } else if (die_one == 6 || die_two == 6) {
            System.out.printf("At least you rolled one six...");
        } else {
            System.out.printf("Just another boring roll...");
        }
    }
}
