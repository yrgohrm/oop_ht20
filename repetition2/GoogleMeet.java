import java.util.ArrayList;
import java.util.List;

public class GoogleMeet {
    public static void main(String[] args) {
        List<MeetPlugin> plugins = new ArrayList<>();
        plugins.add(new GreenScreen());
        plugins.add(new NodPlugin());

        for (MeetPlugin plugin : plugins) { 
            plugin.describeUsers();
            plugin.sendVideoData();
        }
    }
}
