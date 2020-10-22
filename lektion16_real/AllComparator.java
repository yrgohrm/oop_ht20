import java.util.Comparator;

public class AllComparator implements Comparator<AddressBookEntry> {

    @Override
    public int compare(AddressBookEntry o1, AddressBookEntry o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();

        int res = name1.compareTo(name2);
        if (res != 0) {
            return res;
        }

        String email1 = o1.getEmail();
        String email2 = o2.getEmail();

        res = email1.compareTo(email2);
        if (res != 0) {
            return res;
        }

        String phone1 = o1.getPhone();
        String phone2 = o2.getPhone();

        return phone1.compareTo(phone2);
    }
    
}
