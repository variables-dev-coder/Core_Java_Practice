package revision_9;


//Simple try-catch Example

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        System.out.println("Program continues...");
    }
}


//Error: Cannot divide by zero
//Program continues...