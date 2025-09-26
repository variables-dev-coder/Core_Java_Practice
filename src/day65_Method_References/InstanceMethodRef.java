package day65_Method_References;

// Instance Method Reference (specific object)

import java.util.function.Consumer;

public class InstanceMethodRef {
    public static void main(String[] args) {
        // Specific object reference
        Consumer<String> printer = System.out::println;

        printer.accept("Hello Munna!"); // Output: Hello Munna!
        printer.accept("Functional Programming Day 3");
    }
}

// Hello Munna!
// Functional Programming Day 3