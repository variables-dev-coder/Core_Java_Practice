package revision_2;

/*
(d) Constructor Chaining (this() & super())
Constructor chaining = calling one constructor from another.

Using this():

Example:

 */
class Student3 {
    String name;
    int age;

    // 1-arg constructor
    Student3(String name) {
        this(name, 0); // calls 2-arg constructor
    }

    // 2-arg constructor
    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " - " + age);
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {
        Student3 s1 = new Student3("Munna");
        Student3 s2 = new Student3("Aziz", 25);

        s1.show();
        s2.show();
    }
}

/*
Munna - 0
Aziz - 25

Key Takeaways

Constructors are automatically called when objects are created.
Default, Parameterized, Copy are common types.
this() → call another constructor in the same class.
super() → call parent class constructor.

 */