package revision_2;

/*
(d) Constructor Chaining (this() & super())

Constructor chaining = calling one constructor from another.

👉 Using super():

 */

// Parent class
class Person {
    String name;

    // Parent constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called: " + name);
    }
}

// Child class
class Student4 extends Person {
    int age;

    // Child constructor
    Student4(String name, int age) {
        super(name); // Calls Parent(Person) constructor
        this.age = age;
        System.out.println("Student4 constructor called: " + age);
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorChainingSuper {

    public static void main(String[] args) {
        Student4 s1 = new Student4("Munna", 23);
        s1.show();
    }
}


/*

Person constructor called: Munna
Student constructor called: 23
Name: Munna, Age: 23


Explanation:

When new Student("Munna", 23) is created →
First, the Student constructor runs.
It calls super(name) → Parent (Person) constructor executes.
Then the rest of the Student constructor executes.
So execution order = Parent constructor → Child constructor.

Key Takeaways

Constructors are automatically called when objects are created.
Default, Parameterized, Copy are common types.
this() → call another constructor in the same class.
super() → call parent class constructor.


 */