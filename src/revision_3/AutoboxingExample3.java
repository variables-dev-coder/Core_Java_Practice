package revision_3;

import java.util.ArrayList;

public class AutoboxingExample3 {
    public static void main(String[] args) {
        // ArrayList can only store objects, not primitives
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing: int → Integer (happens automatically)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList: " + numbers);
    }
}

/*
Explanation:

Normally, ArrayList only stores objects.
When we add int values (10, 20, 30), Java autoboxes them into Integer objects automatically.
So internally it stores Integer(10), Integer(20), etc.

 */