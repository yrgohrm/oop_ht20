public class Card {
    private Suite suite;
    private int number;

    /**
     * 
     * @param suite
     * @param number
     * @throws IllegalArgumentException if the number is out of range.
     */
    public Card(Suite suite, int number) {
        if (number < 1 || number > 13) {
            throw new IllegalArgumentException("Card number must be from 1 to 13, was " + number);
        }

        this.suite = suite;
        this.number = number;
    }

    public Suite getSuite() {
        return suite;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        String numberAsString = "";
        if (number == 1) {
            numberAsString = "ace";
        }
        else if (number == 11) {
            numberAsString = "jack";
        }
        else if (number == 12) {
            numberAsString = "queen";
        }
        else if (number == 13) {
            numberAsString = "king";
        }
        else {
            numberAsString = String.valueOf(number);
        }

        return numberAsString + " of " + suite;
    }
}
