package people;

public final class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Konstruktor för Person");
    }

    public String getName() {
        return name;
    }

    public void scream() {
        System.out.println("AAAAARGH!!!");
    }
}
