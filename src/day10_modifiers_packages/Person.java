package day10_modifiers_packages;

public class Person {
    private String name = "Munna";           // Only accessible inside Person class
    int age = 28;                            // Default (package-private)
    protected String address = "Hyderabad";  // Accessible in same package + subclasses in other packages
    public String gender = "Male";           // Accessible everywhere

    public void displayDetails() {
        System.out.println("Inside person Class:");
        System.out.println("Name: " + name);         // Private
        System.out.println("Age: " + age);           // Default
        System.out.println("Address: " + address);   // protected
        System.out.println("Gender: " + gender);     // public
    }
}
