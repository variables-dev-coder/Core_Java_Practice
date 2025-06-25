package day10_modifiers_packages;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student();

        //System.out.println("ID: " s1.id);    // private not accessible here
        System.out.println("name: " + s1.name);
        System.out.println("College: " + s1.college);
        System.out.println("Course: " + s1.course);
    }
}
