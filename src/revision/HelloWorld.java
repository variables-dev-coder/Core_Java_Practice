// Import statement
import java.util.Scanner;

// Class declaration
public class HelloWorld {

    // Main method - program entry point
    public static void main(String[] args) {
        // Print to console
        System.out.println("Hello, World!");

        // Variable declaration and initialization
        int number = 10;
        double decimal = 5.7;
        String message = "Java is fun!";

        // If-else statement
        if (number > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is 5 or less");
        }

        // For loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Method call
        greetUser();

        // Using Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");

        scanner.close();
    }

    // Custom method definition
    public static void greetUser() {
        System.out.println("Welcome to the Java program!");
    }
}