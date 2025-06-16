package day1_basics;

public class Student {

    String name;
    int roll;
    double marks;

    // constructor
    Student(String name, int roll, double marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }
}

class StudentDemo{
    public static void main(String[] args) {
        Student s1 = new Student("Munna", 101, 98.06);
        s1.display();
    }
}
