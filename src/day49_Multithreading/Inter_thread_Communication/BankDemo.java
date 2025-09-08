package day49_Multithreading.Inter_thread_Communication;


//Bank Deposit & Withdraw (notify + notifyAll)


class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
        notifyAll(); // multiple withdrawers may be waiting
    }

    public synchronized void withdraw(int amount, String name) {
        while (balance < amount) {
            try {
                System.out.println(name + " waiting to withdraw " + amount);
                wait();
            } catch (InterruptedException e) {}
        }
        balance -= amount;
        System.out.println(name + " withdrew: " + amount + ", Balance: " + balance);
        notify(); // one depositor enough
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(500, "User1"));
        Thread t2 = new Thread(() -> account.withdraw(200, "User2"));

        Thread depositor = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            account.deposit(1000);
        });

        t1.start(); t2.start(); depositor.start();
    }
}

/*
User1 waiting to withdraw 500
User2 waiting to withdraw 200
Deposited: 1000, Balance: 1000
User1 withdrew: 500, Balance: 500
User2 withdrew: 200, Balance: 300
 */