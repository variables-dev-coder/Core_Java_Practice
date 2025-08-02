package revision_1;

// Access Modifiers

public class Main8 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Name: " + p.name);      // public
        System.out.println("Age: " + p.age);        // protected
        System.out.println("City: " + p.city);      // default
        // System.out.println("Password: " + p.password);  // private, will cause error
        p.showInfo();
    }
}
