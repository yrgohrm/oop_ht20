import java.util.Objects;

public class AddressBookEntry implements Comparable<AddressBookEntry> {
    private String name;
    private String email;
    private String phone;

    public AddressBookEntry(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("%s (e-mail: %s, tel: %s)", 
                             name, email, phone);
    }

    @Override
    public int compareTo(AddressBookEntry o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof AddressBookEntry)) {
            return false;
        }

        AddressBookEntry other = (AddressBookEntry) o;

        return Objects.equals(name, other.name) && 
            Objects.equals(email, other.email) &&
            Objects.equals(phone, other.phone);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
   
}
