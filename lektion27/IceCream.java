import java.util.ArrayList;
import java.util.List;

public class IceCream {
    private IceCreamHolder holder;
    private List<IceCreamScoop> scoops;

    public IceCream(IceCreamHolder holder) {
        this.holder = holder;
        this.scoops = new ArrayList<>(5);
    }

    /**
     * Adds a scoop to the ice cream. Can't have more than five scoops.
     * 
     * @param scoop the scoop to add
     * @throws IllegalStateException if the ice cream already contains five scoops
     */
    public void addScoop(IceCreamScoop scoop) {
        if (scoops.size() >= 5) {
            throw new IllegalStateException("Too many scoops.");
        }

        scoops.add(scoop);
    }

    public int size() {
        return scoops.size();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((holder == null) ? 0 : holder.hashCode());
        result = prime * result + ((scoops == null) ? 0 : scoops.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IceCream other = (IceCream) obj;
        if (holder != other.holder)
            return false;
        if (scoops == null) {
            if (other.scoops != null)
                return false;
        } else if (!scoops.equals(other.scoops))
            return false;
        return true;
    }

    @Override
    public String toString() {
        /*
          icecream in a holder with:
          scoop www
          scoop www


        */
        StringBuilder sb = new StringBuilder();
        sb.append("icecream in a ");
        sb.append(holder.toString().toLowerCase());
        sb.append(" with:\n");
        for (IceCreamScoop scoop : scoops) {
            sb.append("\t");
            sb.append(scoop);
            sb.append("\n");
        }

        return sb.toString();
    }
}
