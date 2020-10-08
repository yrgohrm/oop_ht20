import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> beeStages = new ArrayList<>();
        beeStages.add("egg");
        beeStages.add("larvae");
        beeStages.add("pupa");
        beeStages.add("imago");
        Arthropod bee = new Arthropod("bee", beeStages);

        Chordate human = new Chordate("human", 0);

        List<Animal> animals = new ArrayList<>();
        animals.add(bee);
        animals.add(human);

        for (Animal a : animals) {
            System.out.println(a.getName());
        }

        Animal bosse = new Animal("katt");
        
    }
}
