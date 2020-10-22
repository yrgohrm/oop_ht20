import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class AddressBookMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        List<AddressBookEntry> addressBook = new ArrayList<>();
        addressBook.add(new AddressBookEntry("Jamal Kashoggi", "thebestjamal2@protonmail.com", "+471232322"));
        addressBook.add(new AddressBookEntry("Jamal Kashoggi", "thebestjamal2@protonmail.com", "+491232322"));
        addressBook.add(new AddressBookEntry("Jamal Kashoggi", "thebestjamal@protonmail.com", "+471232322"));
        addressBook.add(new AddressBookEntry("Bindi Svensson", "bisv@gmail.com", "+463232322"));
        addressBook.add(new AddressBookEntry("Bindi Andersson", "007bian@gmail.com", "+413232322"));
        addressBook.add(new AddressBookEntry("Zhang Wei", "zhangwei@hotmail.com", "+424252322"));

        // Comparator<AddressBookEntry> comp = 
        //     Comparator.comparing(AddressBookEntry::getEmail);

        // Collections.sort(addressBook, comp);

        // for (AddressBookEntry entry : addressBook) {
        //     System.out.println(entry);
        // }
        // System.out.println("");

        AddressBookEntry e1 = new AddressBookEntry("Zhang Wei", "zhangwei@hotmail.com", "+424252322");
        AddressBookEntry e2 = new AddressBookEntry("Zhang Wei", "zhangwei@hotmail.com", "+424252322");
        AddressBookEntry e3 = new AddressBookEntry("Zhang Wei", "zhangwei@hotmail.com", "+4242322");

        System.out.println(e1.equals(e2) + " " + e1.equals(e3));
    }
}
