package day64_Lambdas;

// Runnable with Lambda

public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Running with Lambda!");
        r.run();
    }
}
