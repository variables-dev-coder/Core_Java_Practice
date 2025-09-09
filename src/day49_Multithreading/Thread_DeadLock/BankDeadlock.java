package day49_Multithreading.Thread_DeadLock;

//Bank Transfer Deadlock

class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }

    public void transfer(Account target, int amount) {
        synchronized (this) {
            synchronized (target) {
                this.balance -= amount;
                target.balance += amount;
                System.out.println("Transferred " + amount);
            }
        }
    }
}

public class BankDeadlock {
    public static void main(String[] args) {
        Account acc1 = new Account(1000);
        Account acc2 = new Account(2000);

        Thread t1 = new Thread(() -> acc1.transfer(acc2, 100));
        Thread t2 = new Thread(() -> acc2.transfer(acc1, 200));

        t1.start();
        t2.start();
    }
}

/*
Transferred 100
Transferred 200


Explanation
t1 locks acc1, waits for acc2.
t2 locks acc2, waits for acc1.
Both block forever → Deadlock
Solution → Use lock ordering (always lock lower account ID first).


 */