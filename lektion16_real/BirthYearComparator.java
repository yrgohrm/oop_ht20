import java.util.Comparator;

public class BirthYearComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int y1 = o1.getBirthYear();
        int y2 = o2.getBirthYear();

        return Integer.compare(y1, y2);
    }
}
