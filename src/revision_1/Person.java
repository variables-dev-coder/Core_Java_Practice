package revision_1;

// Access Modifiers

public class Person {
    public String name = "Munna";
    protected int age = 23;
    String city = "Hyderabad"; // default
    private String password = "secret";

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Password: " + password);
    }
}
