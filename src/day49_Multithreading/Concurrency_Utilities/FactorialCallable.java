package day49_Multithreading.Concurrency_Utilities;


/*
Q1. Explain difference between Runnable and Callable in Java. Implement a program
using Callable that computes factorial of a number and returns the result.

Theory:
Runnable: cannot return a result, cannot throw checked exceptions.
Callable: returns a result (Future<T>) and can throw checked exceptions.

 */


import java.util.concurrent.*;

public class FactorialCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Long> task = () -> {
            int n = 5;
            long fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            return fact;
        };

        Future<Long> result = executor.submit(task);

        System.out.println("Factorial Result: " + result.get());

        executor.shutdown();
    }
}

/*
Factorial Result: 120

Dry Run:
Submits task → computes factorial 5! = 120.
Future.get() blocks until result is ready.
Prints 120.

 */