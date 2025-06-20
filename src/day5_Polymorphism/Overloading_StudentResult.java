package day5_Polymorphism;


class StudentResult {

    // Check pass / fail

    void printResult(int marks) {
        if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("fail");
        }
    }

    // Show percentage and result

    void printResult(int marks, int totalMarks) {
        double percentage = (marks * 100.0) / totalMarks;
        String result = (percentage >= 35) ? "pass" : "Fail";
        System.out.println("Percentage: " + percentage + "%, result: " + result);
    }

    // print Student name and marks

    void printResult(String name, int marks) {
        System.out.println("Student: " + name + ", Marks: " + marks);
    }
}
public class Overloading_StudentResult {
    public static void main(String[] args) {

        StudentResult sr = new StudentResult();

        sr.printResult(45);                            // Pass
        sr.printResult(72, 100);             // Percentage: 72.0%, Result: Pass
        sr.printResult("Munna", 88);            // Student: Munna, Marks: 88
    }
}
