package day49_Multithreading.Synchronization;

//Object vs Class Locks (Demonstration)

class Printer {
    public synchronized void printA() { // lock on 'this'
        System.out.println(Thread.currentThread().getName()+" printing A");
    }
    public static synchronized void printB() { // lock on Printer.class
        System.out.println(Thread.currentThread().getName()+" printing B");
    }
}

public class LockDemo {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new Printer();

        new Thread(p1::printA, "T1").start(); // locks on p1
        new Thread(p2::printA, "T2").start(); // locks on p2
        new Thread(Printer::printB, "T3").start(); // locks on Printer.class
        new Thread(Printer::printB, "T4").start(); // waits for T3
    }
}

/*

T2 printing A
T1 printing A
T3 printing B
T4 printing B

Dry Run
T1 and T2 run concurrently (different instance locks).
T3 and T4 run sequentially (same class lock).

 */