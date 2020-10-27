import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Paging {
    private Iterator<String> currentPos;
    private Set<String> data;

    public Paging() {
        data = new TreeSet<>();
        data.add("Apa");
        data.add("Bepa");
        data.add("Cepa");
        data.add("Depa");
        data.add("Eepa");
        data.add("Fepa");
        data.add("Gepa");

        currentPos = data.iterator();
    }

    public void printNextThree() {
        for (int i = 0; i < 3 && currentPos.hasNext(); ++i) {
            String val = currentPos.next();
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        Paging stuff = new Paging();

        stuff.printNextThree();
        System.out.println("---");
        stuff.printNextThree();
        System.out.println("---");
        stuff.printNextThree();
        System.out.println("---");
        stuff.printNextThree();
    }
}
