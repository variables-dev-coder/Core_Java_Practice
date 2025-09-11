package day49_Multithreading.Concurrency_Utilities;



/*
3. ScheduledExecutorService
Concept:
Run tasks after a delay or periodically.
Replacement for Timer (better).

Example:
 */

import java.util.concurrent.*;

public class SchedulerExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed at " + System.currentTimeMillis());

        scheduler.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
    }
}

/*
Dry Run:
Starts after 1 second.
Runs every 2 seconds.

Task executed at 1757587111668
Task executed at 1757587113675
Task executed at 1757587115668
.
.
.


 */