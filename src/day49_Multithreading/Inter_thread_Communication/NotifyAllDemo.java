package day49_Multithreading.Inter_thread_Communication;



/*
Q. Why while instead of if in wait/notify?
--------------------------------------
Theory + Coding Check

Q: Why is this wrong?
    if (!available) wait();

A:

Because after being notified, a thread doesn’t immediately get CPU.
Another thread might change the condition again before it gets CPU.
Using if → thread continues without rechecking → data inconsistency.
Using while → ensures condition is checked again before continuing.

Example:

while (!available) {
    wait();  // safer than if
}




 */


//Multiple Consumers – notify() vs notifyAll()
//Coding Check



class SharedResource {
    private boolean flag = false;

    public synchronized void doWork(String name) {
        while (!flag) {
            try { wait(); } catch(Exception e) {}
        }
        System.out.println(name + " got the signal and is working!");
    }

    public synchronized void signal() {
        flag = true;
        notifyAll(); // try notify() also
    }
}


public class NotifyAllDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        new Thread(() -> resource.doWork("Thread-1")).start();
        new Thread(() -> resource.doWork("Thread-2")).start();
        new Thread(() -> resource.doWork("Thread-3")).start();

        try { Thread.sleep(1000); } catch(Exception e) {}
        resource.signal();
    }

}

/*
Thread-1 got the signal and is working!
Thread-2 got the signal and is working!
Thread-3 got the signal and is working!



Dry Run
All 3 threads call doWork() → wait until flag=true.
signal() sets flag →
If notify() used → only 1 thread wakes up, others remain waiting (possible deadlock).
If notifyAll() used → all threads wake up, check condition, continue.



Quick Recap of Interview Set
----------------------------
Theory: Why wait/notify needed beyond synchronization.
Coding: Simple wait/notify communication.
Classic Producer-Consumer problem.
Theory + code: Why while instead of if.
notify() vs notifyAll() with multiple consumers.



 */