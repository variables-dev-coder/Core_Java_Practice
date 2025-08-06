import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("------------------------");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Class Average");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    displayStudents(students);
                    break;
                case 3:
                    calculateClassAverage(students);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter marks for Math (0-100): ");
        int math = scanner.nextInt();

        System.out.print("Enter marks for Science (0-100): ");
        int science = scanner.nextInt();

        System.out.print("Enter marks for English (0-100): ");
        int english = scanner.nextInt();

        students.add(new Student(name, id, math, science, english));
        System.out.println("Student added successfully!");
    }

    private static void displayStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("\nSTUDENT RECORDS");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-10s %-6s %-8s %-8s %-8s %-7s\n",
                "Name", "ID", "Math", "Science", "English", "Total", "Grade");

        for (Student student : students) {
            System.out.printf("%-15s %-10s %-6d %-8d %-8d %-8d %-7s\n",
                    student.getName(),
                    student.getId(),
                    student.getMath(),
                    student.getScience(),
                    student.getEnglish(),
                    student.getTotalMarks(),
                    student.getGrade());
        }
    }

    private static void calculateClassAverage(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to calculate average!");
            return;
        }

        double mathSum = 0, scienceSum = 0, englishSum = 0;
        for (Student student : students) {
            mathSum += student.getMath();
            scienceSum += student.getScience();
            englishSum += student.getEnglish();
        }

        int count = students.size();
        System.out.println("\nCLASS AVERAGE MARKS");
        System.out.println("---------------------");
        System.out.printf("Math: %.2f\n", mathSum/count);
        System.out.printf("Science: %.2f\n", scienceSum/count);
        System.out.printf("English: %.2f\n", englishSum/count);
    }
}

class Student {
    private String name;
    private String id;
    private int math;
    private int science;
    private int english;

    public Student(String name, String id, int math, int science, int english) {
        this.name = name;
        this.id = id;
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int getTotalMarks() {
        return math + science + english;
    }

    public String getGrade() {
        int total = getTotalMarks();
        double percentage = total / 3.0;

        if (percentage >= 90) return "A";
        if (percentage >= 80) return "B";
        if (percentage >= 70) return "C";
        if (percentage >= 60) return "D";
        return "F";
    }

    // Getters
    public String getName() { return name; }
    public String getId() { return id; }
    public int getMath() { return math; }
    public int getScience() { return science; }
    public int getEnglish() { return english; }
}