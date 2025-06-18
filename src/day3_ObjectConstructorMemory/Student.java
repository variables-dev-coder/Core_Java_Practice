package day3_ObjectConstructorMemory;

public class Student {
    String name;
    int age;

    Student(){
        name = "Unknown";
        age = 0;
    }

    Student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Munna", 30);
        s1.display();
        s2.display();
    }
}
