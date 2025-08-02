package revision_1;


// Encapsulation Example

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(500);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}

