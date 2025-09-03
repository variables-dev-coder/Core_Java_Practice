package day48_Collection_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        // Adding contacts
        phoneBook.put("Alice", "9876543210");
        phoneBook.put("Bob", "9123456780");
        phoneBook.put("Charlie", "9988776655");

        // Display all contacts
        System.out.println("Phone Directory:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Search a contact
        String searchName = "Bob";
        System.out.println("\nSearching " + searchName + ": " + phoneBook.get(searchName));

        // Update number
        phoneBook.put("Alice", "9000000000");
        System.out.println("\nAfter updating Alice's number: " + phoneBook);

        // Remove a contact
        phoneBook.remove("Charlie");
        System.out.println("\nAfter removing Charlie: " + phoneBook);
    }
}

/*
Logic:
Use HashMap<String, String> → Key = Name, Value = Phone Number.
Support operations:
Add a contact
Search by name
Update phone number
Delete contact
Display all contacts


Phone Directory:
Alice → 9876543210
Bob → 9123456780
Charlie → 9988776655
Searching Bob: 9123456780
After updating Alice's number: {Alice=9000000000, Bob=9123456780, Charlie=9988776655}
After removing Charlie: {Alice=9000000000, Bob=9123456780}



 */