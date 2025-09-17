package day59_Packages_And_import.bank;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }
    public void checkBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}
