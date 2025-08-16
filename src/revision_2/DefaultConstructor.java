package revision_2;

/*
What is a Constructor?

A constructor is a special method used to initialize objects.
It has the same name as the class.
It doesn’t have a return type (not even void).
It is automatically called when an object is created.

(a) Default Constructor

If no constructor is defined, Java provides one automatically.
Example:

 */

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("Default Constructor called!");
        name = "Unknown";
        age = 0;
    }
}

public class DefaultConstructor {

    public static void main(String[] args) {
        Student s1 = new Student(); // Constructor automatically runs
        System.out.println(s1.name + " - " + s1.age);
    }
}

/*
Default Constructor called!
Unknown - 0

 */