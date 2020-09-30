import java.util.Scanner;

/*
Gissa vilket tal jag tänker på? 5
Talet jag söker är mindre än 5.
Gissa vilket tal jag tänker på? 1
Talet jag söker är större än 1.
Gissa vilket tal jag tänker på? 3
Hurra du lyckades!
Som bäst har du lyckats på 3 gissningar.
Som sämst har du lyckats på 3 gissningar.
Vill du spela igen? (J/N)
J
Gissa vilket tal jag tänker på? 5
Hurra du lyckades!
Som bäst har du lyckats på 1 gissningar.
Som sämst har du lyckats på 3 gissningar.
Vill du spela igen?
*/

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        
        GuessResult result;
        
        do {
            System.out.print("Gissa vilket tal jag tänker på? ");
            int theGuess = scan.nextInt();
            result = game.guess(theGuess);
            if (result == GuessResult.CORRECT) {
                System.out.println("Hurra du lyckades!");
            }
            else if (result == GuessResult.TOO_LOW) {
                System.out.printf("Talet jag söker är större än %d.%n",
                                theGuess);
            }
            else {
                System.out.printf("Talet jag söker är mindre än %d.%n",
                                theGuess);
            }
        } while (result != GuessResult.CORRECT);

    }
}