package day37_Iterable_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 20 == 0) { // remove numbers divisible by 20
                iterator.remove();
            }
        }

        System.out.println("After removal: " + numbers);
    }
}

//Output: After removal: [10, 30, 50]
//Shows how Iterator.remove() avoids ConcurrentModificationException.