package revision_2;

/*
Encapsulation

Encapsulation = Wrapping data (fields) & methods together in a single unit (class) + restricting direct access.

Use private variables.
Provide getters & setters for controlled access.
Example:

 */

class Student9 {
    private String name; // private field
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {  // validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student9 s = new Student9();
        s.setName("Munna");
        s.setAge(23);

        System.out.println(s.getName() + " - " + s.getAge());
    }
}

// Munna - 23

/*
Access Modifiers Recap

public → Accessible everywhere.
private → Accessible only in same class.
protected → Accessible in same package + subclasses.
default (no modifier) → Accessible only within same package.


Key Takeaways

Abstraction → Hides implementation details, shows only essential info. (Abstract class, Interface).
Encapsulation → Hides data using private fields + getters/setters.
Together, they make Java code secure, reusable, and maintainable.

 */