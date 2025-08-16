package revision_2;

/*
this keyword

Refers to current class object.
Uses:

To refer current object fields/methods.
To differentiate local variables from instance variables.
To call another constructor in the same class (this()).

Example 1: Differentiating variables

 */

class Student5 {
    String name;
    int age;

    Student5(String name, int age) {
        // local var = instance var
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        Student5 s1 = new Student5("Munna", 23);
        s1.show();
    }
}

// Name: Munna, Age: 23