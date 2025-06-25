package day9_ObjectInitializationGarbageCollection;

// Constructor Initialization
// Pass values via constructor

class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class StudentMain2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Munna");

        s1.display();
    }
}
