package day7_Encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.setAccountHolderName("Pooja Pul");
        ba.setAccountNumber(1234567890);
        ba.setBalance(6257788.09);

        ba.displayAccountInfo();
    }
}
