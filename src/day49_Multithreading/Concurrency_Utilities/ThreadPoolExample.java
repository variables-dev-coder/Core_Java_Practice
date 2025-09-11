package day49_Multithreading.Concurrency_Utilities;



/*
1. Thread Pools (Executor, ExecutorService, ThreadPoolExecutor)
Concept:
Creating a new thread for each task is expensive.
Thread pools reuse threads → improves performance.
Executor = interface → runs tasks.
ExecutorService = adds lifecycle management (shutdown()).
ThreadPoolExecutor = full-featured pool with control over core threads, queue, rejection policy.
Example: Fixed Thread Pool

 */



import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            service.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}

/*
Dry Run:
Pool of 3 threads → handles 5 tasks.
Tasks 1–3 start immediately, tasks 4–5 wait in queue.
Threads finish → pick next tasks.


Task 3 executed by pool-1-thread-3
Task 2 executed by pool-1-thread-2
Task 1 executed by pool-1-thread-1
Task 4 executed by pool-1-thread-3
Task 5 executed by pool-1-thread-3
 */