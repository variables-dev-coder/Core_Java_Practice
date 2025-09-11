package day49_Multithreading.Concurrency_Utilities;

public class Notes {
    public static void main(String[] args) {
        /*


1. Thread Pools (Executor, ExecutorService, ThreadPoolExecutor)
---------------------------------------------------------------
Concept:
    Creating a new thread for each task is expensive.
    Thread pools reuse threads → improves performance.
    Executor = interface → runs tasks.
    ExecutorService = adds lifecycle management (shutdown()).
    ThreadPoolExecutor = full-featured pool with control over core threads, queue, rejection policy.

Example: Fixed Thread Pool

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

Dry Run:
    Pool of 3 threads → handles 5 tasks.
    Tasks 1–3 start immediately, tasks 4–5 wait in queue.
    Threads finish → pick next tasks.


2. Callable & Future
--------------------
Concept:
    Runnable → no return value.
    Callable<V> → returns value & can throw exceptions.
    Future<V> → handle to get result later.

Example

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

Dry Run:
    Task runs in separate thread.
    Main thread continues work.
    result.get() blocks until computation done.



3. ScheduledExecutorService
---------------------------
Concept:
    Run tasks after a delay or periodically.
    Replacement for Timer (better).

Example:

import java.util.concurrent.*;

public class SchedulerExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed at " + System.currentTimeMillis());

        scheduler.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
    }
}


Dry Run:
Starts after 1 second.
Runs every 2 seconds.



4. BlockingQueue (Producer-Consumer)
------------------------------------
Concept:
Thread-safe queue.
Producers put(), consumers take().
Blocks automatically if queue empty/full.

Example:

import java.util.concurrent.*;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {}
        };

        Runnable consumer = () -> {
            try {
                while (true) {
                    int item = queue.take();
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {}
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}


Dry Run:
Producer puts items → blocks if queue full.
Consumer takes items → blocks if queue empty.



5. Concurrent Collections
(a) ConcurrentHashMap
    Thread-safe map.
    Allows concurrent reads and segmented writes.

import java.util.concurrent.*;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Java", 1);

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                map.merge("Java", 1, Integer::sum);
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}



(b) CopyOnWriteArrayList
    Safe for concurrent read-heavy tasks.
    On write → creates new copy


import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        for (String item : list) {
            list.add("C"); // no ConcurrentModificationException
        }

        System.out.println(list);
    }
}


Interview Insights
------------------
    Thread pools = efficiency (reduced context switching).
    Callable/Future = return results.
    ScheduledExecutor = periodic tasks.
    BlockingQueue = producer-consumer without manual wait/notify.
    ConcurrentHashMap = high performance in multithreaded env.
    CopyOnWriteArrayList = optimized for read-heavy workloads.

=====================================================================================================

Q1. Explain difference between Runnable and Callable in Java. Implement a program using Callable
that computes factorial of a number and returns the result.

Theory:
    Runnable: cannot return a result, cannot throw checked exceptions.
    Callable: returns a result (Future<T>) and can throw checked exceptions.

Code:

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


Dry Run:
Submits task → computes factorial 5! = 120.
Future.get() blocks until result is ready.
Prints 120.




Q2. Implement a producer-consumer system using BlockingQueue.

Theory:
Avoids wait()/notify().
Producer put() blocks when queue full.
Consumer take() blocks when queue empty.

Code:

import java.util.concurrent.*;

public class BlockingQueuePC {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i);
                    System.out.println("Produced " + i);
                }
            } catch (InterruptedException e) {}
        };

        Runnable consumer = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int val = queue.take();
                    System.out.println("Consumed " + val);
                }
            } catch (InterruptedException e) {}
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

Dry Run:
Producer inserts 1, 2, 3 → queue full.
Consumer takes items → frees space.
Producer continues.



Q3. Create a scheduled task that runs every 2 seconds and stops after 3 executions.

Theory:
Use ScheduledExecutorService.
Use scheduleAtFixedRate().

Code:

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

Dry Run:
Executes at t=0, t=2s, t=4s.
After 3 runs → shuts down.


Q4. Implement a concurrent map counter using ConcurrentHashMap.

Theory:
HashMap is not thread-safe.
ConcurrentHashMap allows concurrent updates.

Code:

import java.util.concurrent.*;

public class ConcurrentMapCounter {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("count", 0);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.merge("count", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final Count: " + map.get("count"));
    }
}

Dry Run:
Both threads update count safely.
Final result = 2000.



Q5. Demonstrate CopyOnWriteArrayList behavior during iteration when list is modified.

Theory:
Normal ArrayList → ConcurrentModificationException if modified during iteration.
CopyOnWriteArrayList → safe, creates a new copy on modification.

Code:

import java.util.concurrent.*;
import java.util.*;

public class CopyOnWriteExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A"); list.add("B"); list.add("C");

        for (String s : list) {
            System.out.println("Reading: " + s);
            list.add("X"); // safe during iteration
        }

        System.out.println("Final List: " + list);
    }
}

Dry Run:
Iteration runs over original snapshot → prints A, B, C.
Meanwhile, "X" keeps getting added.
Final list: [A, B, C, X, X, X].




         */
    }
}
