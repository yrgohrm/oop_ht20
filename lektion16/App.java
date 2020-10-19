import java.util.ArrayList;
import java.util.List;

public class App {
    private static void doStuff(int i, boolean b) {
        ....
    }


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        int num = numbers.get(0);
        System.out.println(num);
    }
}