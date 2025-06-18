package day2_OPP;

//  Use static to count how many Student objects are created.

class Student3{
    static int count = 0;

    Student3(){
        count++;
        System.out.println("Student " + count + " created");
    }

    static void totalStudents(){
        System.out.println("Total Student: " + count);
    }
}
public class StudentCounterDemo {
    public static void main(String[] args) {
        new Student3();
        new Student3();
        Student3.totalStudents();
    }
}
