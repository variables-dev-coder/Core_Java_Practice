package day7_Encapsulation;


class Student2 {
    String name;
    int age;
    String course;

    // Constructor with all fields
    Student2(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Constructor with name and age ( calls 3 param constructor)
    Student2(String name, int age) {
        this(name, age, "Java"); // Constructor chaining
    }

    // Default constructor (calls 2-param constructor)
    Student2() {
        this("Unknown",18);
    }

    void show() {
        System.out.println(name + " | " + age + " | " + course);
    }
}
public class ConstructorChainingExample {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Pooja",21);
        Student2 s3 = new Student2("John", 22, "Spring Boot");

        s1.show();
        s2.show();
        s3.show();
    }
}
