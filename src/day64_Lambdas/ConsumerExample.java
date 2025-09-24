package day64_Lambdas;

// Consumer (Print Name)

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println("Hello " + s);
        printer.accept("Java Developer");
    }
}
