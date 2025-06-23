package day7_Encapsulation;

public class BankAccount {

    private String accountHolderName;
    private long accountNumber;
    private double balance;

    // Getter for Account Holder Name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for Account Holder Name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for Account Number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter for Account Number
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for Balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    void displayAccountInfo(){
        System.out.println("Account holder Name: " + accountHolderName +
                                                 ", Account Number: " +
                                                 ", Balance: " + balance);
    }
}
