package revision_10;

// Custom Checked Exception in Business Logic

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String msg) {
        super(msg);
    }
}

public class HighExample2 {
    static void transfer(double balance, double amount) throws InvalidTransactionException {
        if (amount <= 0) throw new InvalidTransactionException("Amount must be positive");
        if (amount > balance) throw new InvalidTransactionException("Insufficient funds");
        System.out.println("Transfer successful: " + amount);
    }

    public static void main(String[] args) {
        try {
            transfer(1000, 2000);
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

//Transaction failed: Insufficient funds