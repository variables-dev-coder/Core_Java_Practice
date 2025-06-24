package day8_StaticKeywordStaticBlockStaticMethod;


class Bank {
    static String bankName = "State Bank of India";

    String customerName;
    long accountNo;

    Bank(String customerName, long accountNo) {
        this.customerName = customerName;
        this.accountNo = accountNo;
    }

    void showDetails() {
        System.out.println("Bank: " + bankName + " Customer Name: " + customerName + " Account No: " + accountNo);
    }
}
public class StaticBankDemo {
    public static void main(String[] args) {

        Bank b1 = new Bank("Munna", 123456789);
        Bank b2 = new Bank("Pooja", 987654312);

        b1.showDetails();
        b2.showDetails();
    }
}
