import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        printDouble(new TerminalInputControl(new Scanner(System.in)));
        printDouble(new FileInputControl());
    }

    private static void printDouble(InputControl control) {
        System.out.println(control.getValue()*2);
    }
}
