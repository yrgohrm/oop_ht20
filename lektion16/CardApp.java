import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardApp {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();

        for (Suite suite : Suite.values()) {
            for (int i = 1; i <= 13; ++i) {
                Card c = new Card(suite, i);
                deck.add(c);
            }
        }

        Collections.shuffle(deck);

        for (Card c : deck) {
            System.out.println(c);
        }
    }
}
