package revision_10;


//Global Exception Handling with finally

public class HighExample4 {
    static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return -1; // fallback value
        } finally {
            System.out.println("Cleanup done (finally executed)");
        }
    }

    public static void main(String[] args) {
        int res = divide(10, 0);
        System.out.println("Result: " + res);
    }
}


//Cannot divide by zero
//Cleanup done (finally executed)
//Result: -1