package day45_Collection_Set_Interface_Class;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBasicDemo {
    public static void main(String[] args) {

        // 1. HashSet - Unordered, fastest

        System.out.println("=== HashSet (Unordered) ===");
        Set<String> hashSet = new HashSet<>();
        practiceBasicOperations(hashSet); // Elements print in unpredictable order


        // 2. LinkedHashSet - Insertion-Order
        System.out.println("\n=== LinkedHashSet (Insertion-Order) ===");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        practiceBasicOperations(linkedHashSet); // Elements print in the order they were added

        // 3. TreeSet - Sorted Order (Natural Ordering for Strings: alphabetical)
        System.out.println("\n=== TreeSet (Sorted) ===");
        Set<String> treeSet = new TreeSet<>();
        practiceBasicOperations(treeSet); // Elements print in alphabetical order
    }


    // A helper method to demonstrate basic operations on any Set
    public static void practiceBasicOperations(Set<String> set) {
        // Adding elements
        set.add("Charlie");
        set.add("Alpha");
        set.add("Delta");
        set.add("Bravo");


        // Trying to add a duplicate - will be ignored
        boolean wasAdded = set.add("Alpha");
        System.out.println("Was 'Alpha' added again? " + wasAdded); // false


        // Print the set to see its order
        System.out.println("Set contents: " + set);


        // Check for existence
        System.out.println("Contains 'Charlie'? " + set.contains("Charlie"));


        // Removing an element
        set.remove("Delta");
        System.out.println("After removing 'Delta': " + set);


        // Iterating using a for-each loop
        System.out.print("Iterating: ");
        for (String element : set) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Size and isEmpty
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());
    }
}

/*


=== HashSet (Unordered) ===
Was 'Alpha' added again? false
Set contents: [Delta, Charlie, Alpha, Bravo]
Contains 'Charlie'? true
After removing 'Delta': [Charlie, Alpha, Bravo]
Iterating: Charlie Alpha Bravo
Size: 3
Is empty? false

=== LinkedHashSet (Insertion-Order) ===
Was 'Alpha' added again? false
Set contents: [Charlie, Alpha, Delta, Bravo]
Contains 'Charlie'? true
After removing 'Delta': [Charlie, Alpha, Bravo]
Iterating: Charlie Alpha Bravo
Size: 3
Is empty? false

=== TreeSet (Sorted) ===
Was 'Alpha' added again? false
Set contents: [Alpha, Bravo, Charlie, Delta]
Contains 'Charlie'? true
After removing 'Delta': [Alpha, Bravo, Charlie]
Iterating: Alpha Bravo Charlie
Size: 3
Is empty? false


 */