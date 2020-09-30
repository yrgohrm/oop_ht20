import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Friends friends = new Friends();

        friends.addFriend(new Person("Matz Matzzon", "1980-12-12"));
        friends.addFriend(new Person("Mimmi Mimmisson", "1970-12-12"));

        friends.printMyFriends();
    }
}
