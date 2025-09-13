package revision_10;

public class Example1 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
    }
}

// Error: java.lang.ArithmeticException: / by zero