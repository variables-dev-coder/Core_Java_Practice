package day8_StaticKeywordStaticBlockStaticMethod;


class StudentUtil {
    static void printWelcome(String studentName) {
        System.out.println("Welcome, " + studentName + "!");
    }

    static double getPercentage(int marks1, int marks2, int marks3) {
        int total = marks1 + marks2 + marks3;
        return (total / 3.0);
    }

    static boolean isPassed(double percentage) {
        return percentage >= 35;
    }
}
public class StaticMethodDemo2 {
    public static void main(String[] args) {

        StudentUtil.printWelcome("Sweeta Paul");

        double percentage = StudentUtil.getPercentage(70, 80, 88);
        System.out.println("Percentage: " + percentage);

        if (StudentUtil.isPassed(percentage)) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

    }
}
