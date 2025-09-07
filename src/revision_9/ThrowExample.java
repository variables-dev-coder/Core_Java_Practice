package revision_9;

// Using throw keyword

public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // This will throw exception
    }
}


//Exception in thread "main" java.lang.IllegalArgumentException: Age must be 18 or above