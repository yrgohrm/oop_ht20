import java.util.HashSet;
import java.util.Set;

public class BrokenStuff {
    private int value;

    public BrokenStuff(int value) {
        this.value = value;
    }

    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null)
        return false;
        if (getClass() != obj.getClass())
            return false;
        BrokenStuff other = (BrokenStuff) obj;
        if (value != other.value)
            return false;
        return true;
    }

 
    public static void main(String[] args) {
        Set<BrokenStuff> bsSet = new HashSet<>();

        for (int i = 0; i < 100; ++i) {
            BrokenStuff bs = new BrokenStuff(1);
            bsSet.add(bs);
        }

        System.out.println(bsSet.size());
    }
}
