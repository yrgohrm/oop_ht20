import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, List<String>> jobs = new HashMap<>();
        
        jobs.put("Jane Doe", List.of("Lärare", "Biträde", "Advokat"));
        jobs.put("Bosse Svensson", List.of("Polis", "Lagerarbetare"));
        jobs.put("Irina Tjeckov", List.of("Musiker", "Zooskötare"));

        // här gör vi grejer...

        if (jobs.containsKey("Irina Tjeckov")) {
            List<String> irinasJobs = jobs.get("Irina Tjeckov");
            try {
                irinasJobs.add("Tandläkare");
            }
            catch (UnsupportedOperationException ex) {
                List<String> newJobs = new ArrayList<>();
                newJobs.add("Tandläkare");
                jobs.put("Irina Tjeckov", newJobs);
            }
        }

        for (Map.Entry<String, List<String>> entry : jobs.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
