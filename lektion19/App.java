import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Hampus",
                                                    "    ",
                                                    "Nahid",
                                                    " ",
                                                    "Anders",
                                                    "Eva"));

        Collections.sort(names, 
            (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println(names);

        //List<String> matches = 
        // final String prefix = "Name: ";
        // names.stream().map(s -> prefix + s)
        //               .forEach(System.out::println);
               
            
                // .filter(Predicate.not(String::isBlank))
                // .filter((String s) -> {
                //     if (s.endsWith("s")) {
                //         return s.length() == 6;
                //     }
                //     return s.length() < 5;
                // })
                //.filter(App::endsWithS)
                // .skip(1)
                // .limit(2)
                // .map(String::toUpperCase)
                // .collect(Collectors.toList());

        //System.out.println(matches);

    }

    public static boolean endsWithS(String s) {
        return s.endsWith("s");
    }
}