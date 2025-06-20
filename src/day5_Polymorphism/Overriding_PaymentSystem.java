package day5_Polymorphism;

// Parent class
class Payment {
    void makePayment() {
        System.out.println("Processing generic Payment...");
    }
}

// Child class
class CreditCardPayment extends Payment {
    void makePayment() {
        System.out.println("Processing Payment via Credit Card...");
    }
}

// Child class
class Upipayment extends Payment {
    void makePayment() {
        System.out.println("Processing Payment via UPI...");
    }
}

// child class
class CashPayment extends Payment {
    void makePayment() {
        System.out.println("Processing Payment via Cash...");
    }
}
public class Overriding_PaymentSystem {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.makePayment();   // Processing Payment via Credit Card...

        p = new Upipayment();
        p.makePayment();   // Processing Payment via UPI...

        p = new CashPayment();
        p.makePayment();  // Processing Payment via Cash...
    }
}
