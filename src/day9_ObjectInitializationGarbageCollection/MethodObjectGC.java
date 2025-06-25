package day9_ObjectInitializationGarbageCollection;


class Order {
    Order() {
        System.out.println("Order placed!");
    }

    @Override
    protected void finalize() {
        System.out.println("Order destroyed.");
    }
}
public class MethodObjectGC {
    public static void placeOrder() {
        Order o = new Order(); // Eligible for GC after method ends
    }

    public static void main(String[] args) {
        placeOrder();
        System.gc();
    }
}

