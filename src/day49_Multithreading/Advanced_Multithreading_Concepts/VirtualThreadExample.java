package day49_Multithreading.Advanced_Multithreading_Concepts;


/*
Virtual Threads (Java 21)
Concept:
Also called Project Loom feature.
Virtual threads are lightweight threads managed by JVM, not OS.
Allow thousands/millions of concurrent tasks with low overhead.
Best for IO-bound tasks.

Example:

 */

public class VirtualThreadExample {

    // Java 21 only

    /*

    public static void main(String[] args) throws Exception {
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 5; i++) {
                final int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskId + " running on " + Thread.currentThread());
                    Thread.sleep(1000);
                    return null;
                });
            }
        }
    }


     */
}


/*
Dry Run:

Creates virtual threads for each task.
JVM efficiently schedules them → unlike OS threads.
Output shows multiple VirtualThread[#].


Summary (Advanced Multithreading)
Fork/Join → Recursive parallelism (divide & conquer).
CompletableFuture → Asynchronous pipelines with chaining.
Parallel Streams → Parallel data processing with minimal syntax.
Virtual Threads → Millions of lightweight threads in Java 21+.



 */


