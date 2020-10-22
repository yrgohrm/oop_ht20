import java.util.Comparator;

public class EmailComparator implements Comparator<AddressBookEntry> {
    @Override
    public int compare(AddressBookEntry o1, AddressBookEntry o2) {
        String email1 = o1.getEmail();
        String email2 = o2.getEmail();
        return email1.compareTo(email2);
    }
}
