package day4_Inheritance;


class Account{
    double balance;

    Account(double balance){
        this.balance = balance;
    }

    void calculateInterest(){
        System.out.println("Generic interest calculation");
    }
}

class SavingAccount extends Account{
    SavingAccount(double balance){
        super(balance);  // call parent constructor
    }

    void calculateInterest(){
        System.out.println("Saving Account Interest: 4%");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(10000);
        sa.calculateInterest();

    }
}
