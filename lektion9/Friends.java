import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Friends {
    private List<Person> myFriends;

    public Friends() {
        myFriends = new ArrayList<>();
    }

    public void addFriend(Person p) {
        myFriends.add(p);
    }

    public void printMyFriends() {
        for (Person p : myFriends) {
            System.out.println(p.getName());
        }
    }
}
