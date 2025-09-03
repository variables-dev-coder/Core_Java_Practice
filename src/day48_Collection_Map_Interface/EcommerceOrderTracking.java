package day48_Collection_Map_Interface;


import java.util.HashMap;



import java.util.*;

// Order class
class Order {
    int orderId;
    String customerName;
    double amount;
    String status;

    public Order(int orderId, String customerName, double amount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return orderId + " → " + customerName + ", Amount: " + amount + ", Status: " + status;
    }
}


public class EcommerceOrderTracking {
    public static void main(String[] args) {
        Map<Integer, Order> orders = new HashMap<>();

        // Place new orders
        orders.put(1001, new Order(1001, "Alice", 2500.50, "Processing"));
        orders.put(1002, new Order(1002, "Bob", 1200.00, "Processing"));
        orders.put(1003, new Order(1003, "Charlie", 4999.99, "Processing"));

        // Display all orders
        System.out.println("All Orders:");
        for (Order o : orders.values()) {
            System.out.println(o);
        }

        // Search order by id
        int searchId = 1002;
        System.out.println("\nSearching for Order " + searchId + ":");
        System.out.println(orders.get(searchId));

        // Update order status
        Order updateOrder = orders.get(1001);
        updateOrder.status = "Shipped";
        orders.put(1001, updateOrder);

        System.out.println("\nAfter updating Order 1001:");
        System.out.println(orders.get(1001));

        // Cancel an order
        orders.remove(1003);
        System.out.println("\nAfter canceling Order 1003:");
        System.out.println(orders);
    }
}

/*
All Orders:
1001 → Alice, Amount: 2500.5, Status: Processing
1002 → Bob, Amount: 1200.0, Status: Processing
1003 → Charlie, Amount: 4999.99, Status: Processing

Searching for Order 1002:
1002 → Bob, Amount: 1200.0, Status: Processing

After updating Order 1001:
1001 → Alice, Amount: 2500.5, Status: Shipped

After canceling Order 1003:
{1001=1001 → Alice, Amount: 2500.5, Status: Shipped, 1002=1002 → Bob, Amount: 1200.0, Status: Processing}



Logic:
Create an Order class with orderId, customerName, amount, status.
Use HashMap<Integer, Order> → Key = OrderId, Value = Order object.
Operations:
Place new order
Search order by id
Update order status (Processing → Shipped → Delivered)
Cancel order
Show all orders



 */