import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String phoneNumber;

    public Person() {
        this.name = "Bosse";
        System.out.println("Konstruktor Person");
    }

    public Person(String name) {
        this.name = name;
    }

    public void printStuff() {
        System.out.println("print Person");
    }

    public String getName() {
        return name;
    }

}
