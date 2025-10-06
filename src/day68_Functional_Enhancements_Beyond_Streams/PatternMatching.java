package day68_Functional_Enhancements_Beyond_Streams;

// Pattern Matching for instanceof (Java 16+)
// Cleaner, functional-style type checks:

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "Munna";

        if (obj instanceof String name) {
            System.out.println("Length: " + name.length());   // Length: 5
        }
    }
}
