import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arthropod extends Animal {
    private List<String> stages;

    public Arthropod(String name, List<String> stages) {
        super(name);
        this.stages = new ArrayList<>();
        this.stages.addAll(stages);
    }

    /**
     * Get all the life stages of this animal.
     * 
     * @return an unmodifiable list of the life stages
     */
    public List<String> getStages() {
        return Collections.unmodifiableList(stages);
    }

    public String toString() {
        String data = getName();
        for (String stage : stages) {
            data += "\n" + stage;
        }
        return data;
    }
}
