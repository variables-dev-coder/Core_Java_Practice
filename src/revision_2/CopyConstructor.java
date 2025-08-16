package revision_2;

/*
c) Copy Constructor

A constructor that creates a new object by copying values from another object.
Example:


 */

class Student2 {
    String name;
    int age;

    // Parameterized constructor
    Student2(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student2(Student2 s) {
        this.name = s.name;
        this.age = s.age;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Munna", 23);
        Student2 s2 = new Student2(s1);  // Copy constructor

        System.out.println(s1.name + " - " + s1.age);
        System.out.println(s2.name + " - " + s2.age);
    }

}

/*
Munna - 23
Munna - 23

 */