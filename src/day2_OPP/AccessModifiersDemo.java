package day2_OPP;


class Person{
    private String ssn = "123-45-6789";   // Only within the class
    String name = "Munna";                // default - within package
    protected int age = 29;               // protected - package + subclasses
    public String country = "India";      // public - accessible everywhere


    void showDetails(){
        System.out.println("SSN (private): " + ssn);
        System.out.println("Name (default): " + name);
        System.out.println("Age (protected): " + age);
        System.out.println("Country (public): " + country);
    }
}
public class AccessModifiersDemo {
    public static void main(String[] args) {
        Person p = new Person();

        p.showDetails();

        // You can access:
        System.out.println("-------------------------------");
        System.out.println("Name: " + p.name);          // default
        System.out.println("Age: " + p.age);           // protected
        System.out.println("Country: " + p.country);  // public

        // X The line below would give error
        // System.out.println("SSN: " + p.ssn);  // private, can't access
    }
}
