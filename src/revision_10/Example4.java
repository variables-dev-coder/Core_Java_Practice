package revision_10;

public class Example4 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age < 18 not allowed");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
       // checkAge(15);

        checkAge(20); // Access granted
    }
}

//Exception in thread "main" java.lang.IllegalArgumentException: Age < 18 not allowed