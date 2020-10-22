public class Card {
    private int rank;

    public Card(int rank) {
        if (rank <= 0 || rank > 13) {
            throw new IllegalArgumentException("illegal rank " + rank);
        }

        this.rank = rank;
    }

    public String toString() {
        return "" + rank;
    }
}
