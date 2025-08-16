package revision_2;

// (b) Parameterized Constructor
//Constructor with parameters to set initial values.
//Example:

class Student1 {
    String name;
    int age;

    // Parameterized constructor
    Student1(String n, int a) {
        name = n;
        age = a;
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {
        Student1 s1 = new Student1("Munna", 23);
        Student1 s2 = new Student1("Aziz", 25);

        System.out.println(s1.name + " - " + s1.age);
        System.out.println(s2.name + " - " + s2.age);
    }
}

// Munna - 23
// Aziz - 25