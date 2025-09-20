package day60_Java_Memory_Model;

// Multiple Threads (Stack vs Heap)

class Worker extends Thread {
    public void run() {
        int local = 0; // lives in Stack (thread-local)
        for (int i = 0; i < 5; i++) {
            local++;
            System.out.println(Thread.currentThread().getName() + " local=" + local);
        }
    }
}

public class ThreadStackHeap {
    public static void main(String[] args) {
        Worker t1 = new Worker();
        Worker t2 = new Worker();
        t1.start();
        t2.start();
    }
}

// Each thread has its own stack → local variables don’t clash.
// But if you create an object inside the loop, it goes to heap (shared).

//Thread-1 local=1
//Thread-1 local=2
//Thread-1 local=3
//Thread-1 local=4
//Thread-1 local=5
//Thread-0 local=1
//Thread-0 local=2
//Thread-0 local=3
//Thread-0 local=4
//Thread-0 local=5
