import java.util.ArrayList;
import java.util.List;

import people.Person;
import people.Student;

public class App {
    public static void main(String[] args) {
        Student student = new Student("Jennie Jenniesson", "Java Enterprise Utvecklare");

        List<Person> people = new ArrayList<>();
        people.add(student);
        people.add(new Person("Janne Jannesson"));

        greet(people);
    }


    public static void greet(List<Person> people) {
        for (Person p : people) {
            System.out.println("Hej " + p.getName());
        }
    }
}
