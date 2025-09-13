package revision_10;


// 1. Re-throwing Exception with Custom Message

public class HighExample1 {
    static void processData() throws Exception {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            throw new Exception("Error in processData(): Division failed", e);
        }
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }
}

//Caught in main: Error in processData(): Division failed
//Original cause: java.lang.ArithmeticException: / by zero