package day49_Multithreading.Synchronization;


//Real-time Example – Bank Account


class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
            balance -= amount;
            System.out.println("Balance left: " + balance);
        } else {
            System.out.println("Insufficient funds for " + Thread.currentThread().getName());
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Thread-2");

        t1.start();
        t2.start();
    }
}

/*

Thread-2 withdrawing 700
Balance left: 300
Insufficient funds for Thread-1


Dry Run
If no synchronization: both threads may check balance 1000 → withdraw → final balance wrong (negative).
With synchronized, only one thread can withdraw at a time. Balance stays consistent.


 */