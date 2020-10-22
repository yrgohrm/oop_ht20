import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Erki", "Snook", 1967));
        people.add(new Person("Anna", "Book", 1981));
        people.add(new Person("Ewa", "Gunhildsson", 1990));
        people.add(new Person("Eva", "Gunhildsson", 1932));

        Collections.sort(people, new BirthYearComparator().reversed());

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
