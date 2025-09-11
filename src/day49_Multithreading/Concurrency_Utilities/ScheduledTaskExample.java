package day49_Multithreading.Concurrency_Utilities;


/*
Q3.Create a scheduled task that runs every 2 seconds and stops after 3 executions.
Theory:
Use ScheduledExecutorService.
Use scheduleAtFixedRate().

Code:
 */


import java.util.concurrent.*;

public class ScheduledTaskExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = new Runnable() {
            int count = 0;
            public void run() {
                count++;
                System.out.println("Task run: " + count);
                if (count == 3) scheduler.shutdown();
            }
        };

        scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}

/*
Dry Run:
Executes at t=0, t=2s, t=4s.
After 3 runs → shuts down.

Task run: 1
Task run: 2
Task run: 3
 */
