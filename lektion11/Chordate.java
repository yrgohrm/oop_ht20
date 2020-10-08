public class Chordate extends Animal {
    private int tailLength;

    public Chordate(String name, int tailLength) {
        super(name);
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }
}
