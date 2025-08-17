package revision_3;

import java.util.HashMap;

public class WrapperHashCode {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Autoboxing converts int → Integer
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1000, "Thousand");

        // Fetching values
        System.out.println(map.get(1));     // One
        System.out.println(map.get(1000));  // Thousand

        // Checking hashCode of wrapper objects
        Integer x = 1000;
        Integer y = 1000;

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());  // same hashCode since value is same
        System.out.println(x.equals(y));   // true
    }
}

/*
One
Thousand
1000
1000
true
 */


/*
Key points:

Integer (wrapper class) is immutable, so hashCode() is based on value.
HashMap uses hashCode() + equals() to store and retrieve data.
Even if x and y are different objects, their hashCode() and equals() match → same key in map.
 */