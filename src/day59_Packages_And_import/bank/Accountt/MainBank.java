package day59_Packages_And_import.bank.Accountt;

import day59_Packages_And_import.bank.Account;

public class MainBank {
    public static void main(String[] args) {
        Account acc = new Account("Munna", 5000);
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.checkBalance();
    }
}

//Munna Balance: 4000.0