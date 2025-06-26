package day11_Exception_Handling;

public class TryCatchExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a/b;   // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This block always runs (clenup, logs, etc.");
        }
    }
}
