package day59_Packages_And_import;

import day59_Packages_And_import.student.*;


public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Munna", 88.5);

        StudentService service = new StudentService();
        service.printStudentDetails(s1);
    }
}
