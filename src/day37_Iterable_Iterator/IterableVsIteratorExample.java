package day37_Iterable_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableVsIteratorExample {
    public static void main(String[] args) {
        // Iterable example
        List<String> names = new ArrayList<>();

        names.add("Munna");
        names.add("Sneha");
        names.add("Ravi");
        names.add("Tom");

        // Using iterable for each loop works because list implements iterable
        System.out.println("Using Iterable (for-each loop):");
        for (String name : names) {
            System.out.println(name);
        }

        // Using Iterator
        System.out.println("\nUsing Iterator (manual control):");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);


            // Example of removing using Iterator
            if (name.equals("Ravi")) {
                iterator.remove();    // Safe removal during iteration
            }
        }
        System.out.println("\nList after 'Ravi' with Iterator: " + names);
    }
}

/*

Using Iterable (for-each loop):
Munna
Sneha
Ravi
Tom

Using Iterator (manual control):
Munna
Sneha
Ravi
Tom

List after 'Ravi' with Iterator: [Munna, Sneha, Tom]



Internal Difference Shown:
Iterable → Just provides the iterator() method → allows enhanced for loop.
Iterator → Provides hasNext(), next(), and remove() → gives manual control over iteration.
With Iterable, you cannot remove while looping.
With Iterator, you can safely remove while iterating.


 */