package revision_10;

public class Example11 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                throw new RuntimeException("Arithmetic failed", e);
            }
        } catch (RuntimeException e) {
            System.out.println("Cause: " + e.getCause());
        }
    }
}

//Cause: java.lang.ArithmeticException: / by zero