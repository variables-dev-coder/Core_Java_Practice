package day13_Arrays_Strings_DSA_Part2;


/*
1. String Interning and Immutability
Concept:
-Java maintains a String Pool in the heap.
-If Strings were mutable, changing one reference would also change the value for
  all references pointing to the same pooled String — which would break consistency.
-Immutability ensures that pooled strings remain safe to reuse.
 */

public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java"; // From pool

        System.out.println(s1 == s2); // true - same reference

        // If strings were mutable and s1 changed, s2 would also change (which would be dangerous)
        s1 = s1 + " Rocks"; // Creates a new object, doesn't modify s1 in pool

        System.out.println(s1 == s2); // false - different references now
    }
}
// Key Point: Without immutability, string interning would not be safe