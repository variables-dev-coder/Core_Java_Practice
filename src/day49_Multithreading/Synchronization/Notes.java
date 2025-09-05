package day49_Multithreading.Synchronization;

public class Notes {
    public static void main(String[] args) {


        /*

What is synchronization?

When multiple threads touch the same data, you can get race
conditions (lost updates, corrupted state). Synchronization
ensures mutual exclusion (only one thread enters a critical section)
and visibility (writes by one thread become visible to others).



How synchronized actually works (internals but friendly)
    Every Java object has a monitor (a lock).
    synchronized compiles to bytecodes monitorenter and monitorexit.
    Entering a monitor:
        If no one holds it → current thread acquires it and continues.
        If someone holds it → current thread blocks (WAITING) until it’s released.

    Reentrant: the thread that owns the lock can acquire it again on the same object (a counter is incremented).
    Happens-Before rule: a successful unlock happens-before a subsequent lock on the same monitor → guarantees
    memory visibility.

Locks are on objects:
    synchronized (this) { ... } → instance lock
    synchronized (SomeClass.class) { ... } or static synchronized → class lock (one per class)


Forms of synchronization
1) Synchronized method (instance lock)

    class Counter {
        private int count = 0;
        public synchronized void increment() { // lock: this
            count++;
        }
        public synchronized int get() { // lock: this
            return count;
        }
    }

When to use: entire method is a critical section.


2) Synchronized block (any lock object)

    class Counter2 {
        private int count = 0;
        private final Object lock = new Object(); // dedicated mutex
        public void increment() {
            // do non-critical work...
            synchronized (lock) { // lock: lock
                count++;
            }
            // do non-critical work...
        }
    }
    When to use: protect only the minimum code that must be atomic → less contention.


3) Static synchronization (class lock)

    class IdGen {
        private static int nextId = 1;
        public static synchronized int next() { // lock: IdGen.class
            return nextId++;
        }
    }
 When to use: protecting static/shared class state across all instances.


Classic race condition → fix
Without sync


    class BrokenCounter {
        int count = 0;
        void inc() { count++; } // read, add, write (NOT atomic)
    }
    public class DemoRace {
        public static void main(String[] a) throws Exception {
            BrokenCounter c = new BrokenCounter();
            Thread t1 = new Thread(() -> { for (int i=0;i<100000;i++) c.inc(); });
            Thread t2 = new Thread(() -> { for (int i=0;i<100000;i++) c.inc(); });
            t1.start(); t2.start(); t1.join(); t2.join();
            System.out.println(c.count); // often < 200000
        }
    }

Dry run (simplified)

    t1 reads count=0 → +1 → plan to write 1
    t2 reads count=0 → +1 → plan to write 1
    Both write 1 → one increment lost.

With sync

    class SafeCounter {
        private int count = 0;
        synchronized void inc() { count++; }
        synchronized int get() { return count; }
    }

Now only one thread at a time executes inc(), and visibility is guaranteed.


======================

Object vs Class locks (demonstration)

class Printer {
    public synchronized void printA() { // lock: this
        System.out.println(Thread.currentThread().getName()+" printing A");
        try { Thread.sleep(300); } catch (InterruptedException ignored) {}
    }
    public static synchronized void printB() { // lock: Printer.class
        System.out.println(Thread.currentThread().getName()+" printing B");
        try { Thread.sleep(300); } catch (InterruptedException ignored) {}
    }
}
public class ObjVsClass {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new Printer();

        // Instance locks are independent per object:
        new Thread(p1::printA, "T1").start();
        new Thread(p2::printA, "T2").start();

        // Class lock is single, blocks across all threads:
        new Thread(Printer::printB, "T3").start();
        new Thread(Printer::printB, "T4").start();
    }
}

Dry run
T1 and T2 can run printA() concurrently because they lock different objects (p1, p2).
T3 and T4 serialize on Printer.class (one at a time).



Reentrancy (why it matters)

class ReentrantDemo {
    public synchronized void outer() {
        System.out.println("outer acquired");
        inner(); // same thread can re-enter
    }
    public synchronized void inner() {
        System.out.println("inner acquired");
    }
}



Dry run

Thread enters outer() → acquires this monitor (reentrancy count=1)

Calls inner() → tries to acquire this again → allowed (count=2)

Returns inner() (count=1) → returns outer() (count=0, lock released)


==================================

Visibility: synchronized vs volatile
volatile guarantees visibility and ordering for a single variable but not atomicity of compound actions (x++).
synchronized gives mutual exclusion + visibility for everything inside the critical section.

Example: stop flag

class Runner {
    private volatile boolean running = true; // volatile ensures visibility
    public void stop() { running = false; }
    public void run() {
        while (running) {  work  }
        System.out.println("Stopped.");
}
}


============================

If you used a plain boolean without volatile or without synchronizing on the
same monitor, worker might never see the update due to caching/reordering.

You could also achieve visibility via synchronization:


class Runner2 {
    private boolean running = true;
    private final Object lock = new Object();
    public void stop() { synchronized (lock) { running = false; } }
    public void run() {
        while (true) {
            synchronized (lock) { if (!running) break; }
            // work...
        }
    }
}

============================

Choosing the correct lock object

Do:

Use a private final lock object for library classes: private final Object lock = new Object();
Keep critical sections tiny (only the data manipulation).

Avoid:

Locking on this if external code can also synchronize on your instance (risk of unintended coupling).
Locking on publically accessible or mutable objects.
Locking on String literals ("abc") — they’re interned → global unintended sharing.


=========================

Compound actions & check-then-act (common bug)
// NOT thread-safe
if (!map.containsKey(k)) {
    map.put(k, compute(k));
}


Two threads can both see “absent” and both put.

Fix with synchronization


private final Object lock = new Object();
if (map.get(k) == null) {
    synchronized (lock) {
        if (map.get(k) == null) {
            map.put(k, compute(k));
        }
    }
}
(We’ll later learn ConcurrentHashMap/computeIfAbsent as better tools.)

================================

Producer–Consumer (peek ahead)

wait/notify/notifyAll are inter-thread communication, which we’ll do tomorrow.
For now, remember: wait() releases the monitor and sleep() does not.

=================================


Performance & design tips
Prefer synchronized blocks around the minimum code that mutates shared state.
Avoid holding locks while doing I/O or long computations.
Identify contention hot spots and split state (sharding) to reduce lock conflicts.
Document what each lock protects (the “guarded by” comment).


Mini practice set (with runnable answers)
1) Safe bank withdrawals (single account)

class Account {
    private int balance = 1000;
    public synchronized boolean withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }
    public synchronized int balance() { return balance; }
}
public class BankSafe {
    public static void main(String[] args) throws Exception {
        Account a = new Account();
        Thread t1 = new Thread(() -> { for (int i=0;i<500;i++) a.withdraw(1); }, "U1");
        Thread t2 = new Thread(() -> { for (int i=0;i<600;i++) a.withdraw(1); }, "U2");
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("Final balance: " + a.balance());
    }
}

Dry run: withdraw is atomic per call. At most 1000 successful ₹1 withdrawals
across threads; no negative balances, no lost updates.

===================================

2) Fine-grained lock with a dedicated mutex

class Inventory {
    private int stock = 0;
    private final Object lock = new Object();
    void add(int n) { synchronized (lock) { stock += n; } }
    boolean take(int n) {
        synchronized (lock) {
            if (stock >= n) { stock -= n; return true; }
            return false;
        }
    }
    int get() { synchronized (lock) { return stock; } }
}
Why better? Limits the locked region to only the mutation/reads and avoids exposing this as a lock



============================================


3) Prove static synchronization serializes across instances


class ClassLock {
    public static synchronized void f() {
        System.out.println(Thread.currentThread().getName()+" entered f");
        try { Thread.sleep(200); } catch (InterruptedException ignored) {}
        System.out.println(Thread.currentThread().getName()+" leaving f");
    }
    public void g() {
        synchronized (ClassLock.class) { // same as static sync
            System.out.println(Thread.currentThread().getName()+" in g");
        }
    }
}
public class StaticSyncDemo {
    public static void main(String[] args) {
        ClassLock a = new ClassLock();
        ClassLock b = new ClassLock();
        new Thread(ClassLock::f, "T1").start();
        new Thread(b::g, "T2").start(); // will wait for T1
    }
}



================================



Quick interview Q&A (synchronization)

Q1. Method vs block?
Method locks the entire method on one monitor; block lets you lock a chosen object and a smaller region → usually better.

Q2. What does synchronized guarantee?
Mutual exclusion and visibility (via happens-before). Atomicity only for the code in the critical section.

Q3. Is count++ atomic?
No. It’s read-modify-write; must be in a synchronized region (or use AtomicInteger, which we’ll cover later).

Q4. Can wait() be called outside synchronized?
No. It must be called by a thread that owns the monitor. (Deep dive tomorrow.)

Q5. Can synchronization cause deadlock?
Yes, with multiple locks and inconsistent ordering. (We’ll tackle deadlocks on Day 4.)








         */


    }
}
