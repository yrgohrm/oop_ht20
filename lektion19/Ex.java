import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Skriv ett namn:");
                String name = scan.nextLine();
                if (name.trim().isEmpty()) {
                    break;
                }

                names.add(name);
            }
        }

        List<String> filteredNames = 
            names.stream()
                .map(s -> s.replaceAll("\\s+", ""))
                .filter(s -> s.length() > 1)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        
        for (String str : filteredNames) {
            System.out.println(str);
        }

        filteredNames.stream().forEach(System.out::println);
    }
}
