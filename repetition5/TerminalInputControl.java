import java.util.Scanner;

public class TerminalInputControl implements InputControl {
    private Scanner scan;

    public TerminalInputControl(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public int getValue() {
        System.out.println("Enter value: ");
        return scan.nextInt();
    }    
}
