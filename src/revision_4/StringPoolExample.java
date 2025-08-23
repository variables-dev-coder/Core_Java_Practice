package revision_4;

public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Java";                // goes to String pool
        String s2 = "Java";                // reused from pool
        String s3 = new String("Java");    // new object in heap
        String s4 = s3.intern();           // refers to pool object

        System.out.println(s1 == s2); // true (same pool reference)
        System.out.println(s1 == s3); // false (heap vs pool)
        System.out.println(s1 == s4); // true (s4 interned to pool)
    }
}

/*
true
false
true


Topic 2: String Pool & intern()
Explanation
Java maintains a String Constant Pool (SCP) inside the heap.
All string literals are stored here for reusability.
If you create a string using new String(), it will not go to the pool automatically
(a new object is created in the heap).
The intern() method returns the reference from the pool (adds it if not present).


Dry Run
1."Java" → stored in SCP.
2.s1 points to "Java".
3.s2 also points to "Java" in pool (no new object).
4.new String("Java") creates a separate object in heap.
5.intern() makes s4 point to SCP "Java".


 */