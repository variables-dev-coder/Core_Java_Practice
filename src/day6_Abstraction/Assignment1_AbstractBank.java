package day6_Abstraction;


abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        }
    }
}

public class Assignment1_AbstractBank {
    public static void main(String[] args) {

        BankAccount account = new SavingsAccount("Munna", 5000);

        account.deposit(2000);     // Deposit ₹2000
        account.withdraw(1000);    // Withdraw ₹1000
        account.showBalance();     // Show balance

    }
}
