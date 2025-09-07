package revision_9;




// Step 1: Define Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void withdraw(int balance, int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance. Available: " + balance);
        } else {
            System.out.println("Withdrawal successful! Remaining balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(1000, 1500);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


//Caught Exception: Not enough balance. Available: 1000