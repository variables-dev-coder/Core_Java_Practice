package day9_ObjectInitializationGarbageCollection;


class Student {
    int id;        // 0
    String name;  // null

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
