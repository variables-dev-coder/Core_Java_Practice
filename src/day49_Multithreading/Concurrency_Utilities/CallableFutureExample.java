package day49_Multithreading.Concurrency_Utilities;



/*

2. Callable & Future
Concept:
Runnable → no return value.
Callable<V> → returns value & can throw exceptions.
Future<V> → handle to get result later.

Example:
 */


import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };

        Future<Integer> result = service.submit(task);

        System.out.println("Doing other work...");
        System.out.println("Result: " + result.get()); // waits if needed

        service.shutdown();
    }
}

/*
Dry Run:
    Task runs in separate thread.
    Main thread continues work.
    result.get() blocks until computation done.

Doing other work...
Result: 42


 */