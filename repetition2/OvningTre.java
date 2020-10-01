import java.util.ArrayList;
import java.util.List;

public class OvningTre {
    public static void main(String[] args) {
        List<Translator> translators = new ArrayList<>();
        translators.add(new Robber());
        translators.add(new AllLang());

        System.out.println("Vi kan hantera:");
        for (Translator trans : translators) {
            System.out.print(trans.getLanguage() + ": ");
            System.out.println(trans.translate("Hej allihopa"));
        }
    }
}
