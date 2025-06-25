package day9_ObjectInitializationGarbageCollection;


class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Customer " + name + " destroyed.");
    }
}

public class MultipleGC {
    public static void main(String[] args) {
        Customer c1 = new Customer("Pooja");
        Customer c2 = new Customer("Munna");
        Customer c3 = new Customer("Aziz");

        c1 = null;
        c2 = null;
        c3 = null;

        System.gc();
    }
}
