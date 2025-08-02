package revision_1;

// A. Class and Object

class Student {
    String name;
    int age;

    void showDetails() {
        System.out.println(name + " " + age + " years old");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aziz";
        s.age = 22;
        s.showDetails();
    }
}
