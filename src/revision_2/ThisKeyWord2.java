package revision_2;



class Student6 {
    String name;
    int age;

    Student6() {
        this("Unknown", 0); // calls parameterized constructor
    }

    Student6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeyWord2 {
    public static void main(String[] args) {
        Student6 s1 = new Student6();         // Calls default
        Student6 s2 = new Student6("Aziz", 25); // Calls parameterized
        s1.show();
        s2.show();
    }

}

/*
Name: Unknown, Age: 0
Name: Aziz, Age: 25

 */