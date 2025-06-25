package day10_modifiers_packages;

public class AccessTest {
    public static void main(String[] args) {
        Person p = new Person();

        //System.out.println("Name: " + p.name);     // private not accessible

        System.out.println("Age: " + p.age);     // default
        System.out.println("Address: " + p.address);  // protected
        System.out.println("gender: " + p.gender);    // public

        // Call method from Person
        p.displayDetails();
    }
}
