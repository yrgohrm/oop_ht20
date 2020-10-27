import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> theSet = new TreeSet<>();

        theSet.add("Bosse");
        theSet.add("Hampus");
        theSet.add("Hampus");
        theSet.add("Hampus");
        theSet.add("Anna");

        for (String str : theSet) {
            System.out.println(str);
        }

        if (theSet.contains("Hampus")) {
            System.out.println("Hampus är med!");
        }

        Iterator<String> it = theSet.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);

            if (it.hasNext()) {
                it.next();
            }
        }
    }
}