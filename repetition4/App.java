public class App {
    public static void main(String[] args) {
        // String name = "Hampus";
        // char[] myArray = name.toCharArray();
        // System.out.println(name.charAt(3));
        // System.out.println(myArray[3]);

        Person person = new Student("Jennie Jenniesson", "Java Enterprise Utvecklare");
        person.getName();
        //person.getProgram();
        person.printStuff();

        if (person instanceof Student) {
            // vet vi att person är en student
            Student s = (Student) person;
            s.getProgram();
        }


        // Student s = new Student("Jennie Jenniesson", "Java Enterprise Utvecklare");
        // sendBirthDaySms(s);

        // Pensioneer p = ..;
        // sendBirthDaySms(p);
    }

    public static void sendBirthDaySms(Person person) {
        // ....
    }
}