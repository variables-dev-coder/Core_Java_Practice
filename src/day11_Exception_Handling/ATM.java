package day11_Exception_Handling;

public class ATM {
    private double balance;

    // Constructor to initialize ATM balance
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance. Available: ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " Successful.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        ATM myATM = new ATM(5000);

        myATM.withdraw(3000);
        myATM.withdraw(2500);
    }
}
