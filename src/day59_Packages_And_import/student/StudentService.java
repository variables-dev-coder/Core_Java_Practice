package day59_Packages_And_import.student;

public class StudentService {
    public void printStudentDetails(Student s) {
        System.out.println("Student: id " + s.getId() + ", Name  "+ s.getName() + ", Marks: " + s.getMarks());
    }
}
