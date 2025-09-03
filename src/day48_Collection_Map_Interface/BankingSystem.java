package day48_Collection_Map_Interface;


import java.util.*;

// Account class
class Account {
    long accountNumber;
    String name;
    double balance;

    public Account(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountNumber + " → " + name + ", Balance: " + balance;
    }
}


public class BankingSystem {
    public static void main(String[] args) {
        Map<Long, Account> accounts = new HashMap<>();

        // Open accounts
        accounts.put(10001L, new Account(10001L, "Alice", 5000));
        accounts.put(10002L, new Account(10002L, "Bob", 10000));
        accounts.put(10003L, new Account(10003L, "Charlie", 7500));

        // Display all accounts
        System.out.println("Bank Accounts:");
        for (Account acc : accounts.values()) {
            System.out.println(acc);
        }

        // Deposit money
        Account acc1 = accounts.get(10001L);
        acc1.balance += 2000;
        accounts.put(10001L, acc1);
        System.out.println("\nAfter depositing 2000 to Alice:");
        System.out.println(accounts.get(10001L));

        // Withdraw money
        Account acc2 = accounts.get(10002L);
        double withdrawAmount = 3000;
        if (acc2.balance >= withdrawAmount) {
            acc2.balance -= withdrawAmount;
        } else {
            System.out.println("Insufficient balance!");
        }
        accounts.put(10002L, acc2);
        System.out.println("\nAfter withdrawing 3000 from Bob:");
        System.out.println(accounts.get(10002L));

        // Check balance
        long checkAcc = 10003L;
        System.out.println("\nBalance of " + checkAcc + ": " + accounts.get(checkAcc).balance);

        // Close account
        accounts.remove(10001L);
        System.out.println("\nAfter closing Alice's account:");
        System.out.println(accounts);
    }
}


/*
Bank Accounts:
10001 → Alice, Balance: 5000.0
10002 → Bob, Balance: 10000.0
10003 → Charlie, Balance: 7500.0

After depositing 2000 to Alice:
10001 → Alice, Balance: 7000.0

After withdrawing 3000 from Bob:
10002 → Bob, Balance: 7000.0

Balance of 10003: 7500.0

After closing Alice's account:
{10002=10002 → Bob, Balance: 7000.0, 10003=10003 → Charlie, Balance: 7500.0}

 */