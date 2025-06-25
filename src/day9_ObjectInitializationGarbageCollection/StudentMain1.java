package day9_ObjectInitializationGarbageCollection;

// Default Initialization
// When no constructor or value is assigned.

class Student1 {
    int id;        // 0
    String name;  // null

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class StudentMain1 {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.display();
    }
}
