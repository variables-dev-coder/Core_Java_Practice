package day13_Arrays_Strings_DSA_Part2;


// Mutable Address class
class Address {
    private String city;
    private String state;

    // constructor
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // getter methods
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    // setter methods, (Since Address is mutable)
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
public final class Employee2 {
    private final int id;
    private final String name;
    private final Address address;  // mutable object, must handle carefully

    public Employee2(int id, String name, Address address) {
        this.id = id;
        this.name = name;

        // Deep copy to avoid external changes
        this.address = new Address(address.getCity(), address.getState());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return deep copy of mutable field
    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }
    // No setters -> Value cant be changed
}

class TestImmutable2 {
    public static void main(String[] args) {
        Address addr = new Address("Kolkata", "West Bengal");
        Employee2 emp = new Employee2(1, "Munna", addr);

        System.out.println("Before change: " + emp.getAddress().getCity());

        // Try to modify original Address object
        addr.setCity("Mumbai");

        System.out.println("After changing original: " + emp.getAddress().getCity());

        // Try to modify via getter
        emp.getAddress().setCity("Delhi");

        System.out.println("After changing via getter: " + emp.getAddress().getCity());
    }
}

//Before change: Kolkata
//After changing original: Kolkata
//After changing via getter: Kolkata