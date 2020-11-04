public class Student extends Person {
    private String program;

    public Student(String name, String program) {
        //super(name);
        this.program = program;
        
        System.out.println("Konstruktor Student");
    }

    @Override
    public void printStuff() {
        System.out.println("print Student");
        super.printStuff();
    }

    public String getProgram() {
        return program;
    }

}
