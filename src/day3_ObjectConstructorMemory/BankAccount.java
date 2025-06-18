package day3_ObjectConstructorMemory;


class Customer{
    String name;

    Customer(String name){
        this.name = name;
    }
}

public class BankAccount {
    Customer customer;
    double balance;

    BankAccount(Customer customer, double balance){
        this.customer = customer;
        this.balance = balance;
    }

    void showDetails(){
        System.out.println("Customer: " + customer.name + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Customer c = new Customer("Munna");
        BankAccount acc = new BankAccount(c,25000);
        acc.showDetails();

    }
}
