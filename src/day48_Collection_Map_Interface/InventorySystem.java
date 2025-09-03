package day48_Collection_Map_Interface;


/*
How can you use Map to manage an inventory system where each item has a name and a stock quantity?

Logic:
Use HashMap<String, Integer> → Key = Item Name, Value = Quantity.
Operations:
Add new item
Update stock (increase/decrease)
Check availability
Remove out-of-stock item
Display inventory
 */


import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // Adding items
        inventory.put("Laptop", 10);
        inventory.put("Mobile", 25);
        inventory.put("Headphones", 50);

        System.out.println("Initial Inventory: " + inventory);

        // Sell an item (decrease stock)
        String sellItem = "Mobile";
        if (inventory.containsKey(sellItem)) {
            inventory.put(sellItem, inventory.get(sellItem) - 1);
        }
        System.out.println("\nAfter selling 1 Mobile: " + inventory);

        // Restock an item
        inventory.put("Laptop", inventory.get("Laptop") + 5);
        System.out.println("\nAfter restocking Laptops: " + inventory);

        // Check availability
        String checkItem = "Headphones";
        System.out.println("\nAvailable stock of " + checkItem + ": " + inventory.get(checkItem));

        // Remove out-of-stock items
        inventory.put("Mobile", 0); // simulate stock finish
        inventory.entrySet().removeIf(entry -> entry.getValue() == 0);
        System.out.println("\nAfter removing out-of-stock items: " + inventory);
    }
}

/*
Initial Inventory: {Laptop=10, Mobile=25, Headphones=50}
After selling 1 Mobile: {Laptop=10, Mobile=24, Headphones=50}
After restocking Laptops: {Laptop=15, Mobile=24, Headphones=50}
Available stock of Headphones: 50
After removing out-of-stock items: {Laptop=15, Headphones=50}



 */