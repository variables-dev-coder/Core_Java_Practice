package day8_StaticKeywordStaticBlockStaticMethod;


class BankUtil {

    // Static method to check balance
    static void checkBalance(String name, double balance) {
        System.out.println("Hello " + name + ", Your balance is ₹: " + balance);
    }

    // Static method to calculate interest
    static double calculateInterest(double principle, double rate, int years) {
        return (principle * rate * years) / 100;
    }

    // Static method to check loan eligibility
    static boolean isEligibleForLoan(double salary) {
        return salary >= 25000;
    }
}
public class StaticMethodBankUtilDemo {
    public static void main(String[] args) {
        BankUtil.checkBalance("Pinky", 15000.56);

        double interest = BankUtil.calculateInterest(100000, 7.5, 3);
        System.out.println("Interest for 2 years: ₹" + interest);

        boolean eligible = BankUtil.isEligibleForLoan(28000);
        if(eligible){
            System.out.println("You are eligible for loan");
        } else {
            System.out.println("Not eligible for loan");
        }
    }
}
