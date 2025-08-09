package revisaion_Core_Oop;

public class TypeCasting {
    public static void main(String[] args) {

        // Widening casting
        int salary = 25000;
        double salaryDub = salary;

        // Widening printing
        System.out.println("Windening: int to double = " + salaryDub);    // 25000.0

        // Narrowing Casting
        double decimalNum = 3.14;
        int wholeNum = (int) decimalNum;

        // Narrowing printing
        System.out.println("Narrowing: double to int = " + wholeNum); // 3
    }
}
