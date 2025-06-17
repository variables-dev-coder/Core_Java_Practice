package day2_OPP;


class Student{
    int id;
    String name;

    void display(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class StudentObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student(); // Creating object
        s1.id = 101;
        s1.name = "Munna";
        s1.display();

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Aziz";
        s2.display();

    }
}
