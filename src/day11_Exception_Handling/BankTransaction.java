package day11_Exception_Handling;

public class BankTransaction {
    static void deposit(double amount) {
        if (amount <= 0) {
            throw new NegativeAmountException("Deposit amount must be greater than zero");
        } else {
            System.out.println("Successfully deposit ₹" + amount);
        }
    }

    public static void main(String[] args) {
        deposit(500);
        deposit(-300);
    }
}
