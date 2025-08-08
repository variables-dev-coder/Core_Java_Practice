package revision;


// File: EncapsulationExample.java
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Munna", 5000);

        // Accessing data through methods (not directly)
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(2000);
        account.withdraw(1000);
        System.out.println("Updated Balance: " + account.getBalance());

        // Changing name through setter
        account.setAccountHolder("Munna Aziz");
        System.out.println("Updated Account Holder: " + account.getAccountHolder());
    }
}


/*

Account Holder: Munna
Balance: 5000.0
Deposited: 2000.0
Withdrawn: 1000.0
Updated Balance: 6000.0
Updated Account Holder: Munna Aziz

 */