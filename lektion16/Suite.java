import java.util.concurrent.ThreadLocalRandom;

public enum Suite {
    HEARTS, DIAMONDS, SPADES, CLUBS;

    public static final Suite random() {
        Suite[] allSuits = Suite.values();
        int r = ThreadLocalRandom.current().nextInt(allSuits.length);
        return allSuits[r];
    }

    @Override
    public String toString() {
        switch (this) {
            case HEARTS:
                return "hearts";
            case DIAMONDS:
                return "diamonds";
            case CLUBS:
                return "clubs";
            case SPADES:
                return "spades";
        }

        throw new IllegalArgumentException();
    }
}
