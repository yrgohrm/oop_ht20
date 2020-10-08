package people;

public class Student extends Person {
    private String program;

    public Student(String name, String program) {
        super(name);
        this.program = program;
        System.out.println("Konstruktor för Student");
    }

    public String getProgram() {
        return program;
    }

    @Override
    public void scream() {
        System.out.println("BÄÄÄÄÄÄRS!!!");
    }

    public void takeExam() {
        System.out.println("do exam");
    }
}
