package day37_Iterable_Iterator;

/*
Key Reminder
Iterable → provides an iterator() method. It means a collection can be iterated.
Iterator → the actual object that performs the iteration (using hasNext() & next()).


 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableVsIteratorExample2 {
    public static void main(String[] args) {
        // A list is Iterable (because List implements Iterable)
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // 1. Using Iterable (enhanced for loop internally uses Iterator)
        System.out.println("Using Iterable (for-each loop):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. Using Iterator directly
        System.out.println("\nUsing Iterator manually:");
        Iterator<String> it = fruits.iterator(); // get iterator object
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);

            // Example of Iterator's remove()
            if (fruit.equals("Banana")) {
                it.remove(); // safe removal
            }
        }

        // After removal
        System.out.println("\nList after removing Banana using Iterator:");
        System.out.println(fruits);
    }
}

/*
Using Iterable (for-each loop):
Apple
Banana
Mango

Using Iterator manually:
Apple
Banana
Mango

List after removing Banana using Iterator:
[Apple, Mango]


Difference Shown in Program
Iterable → allows for-each loop (clean & readable).
Iterator → gives you control: you can remove elements safely while iterating.
 */