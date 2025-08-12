package day13_Arrays_Strings_DSA_Part2;


/*
HashCode Caching
Concept:
-String.hashCode() is calculated once and cached because the value never changes.
-This boosts performance in hash-based collections like HashMap.
 */

public class HashCodeCaching {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.hashCode()); // First time, calculated
        System.out.println(str.hashCode()); // Subsequent calls, cached
    }
}

//69609650
//69609650


// Key Point: If Strings were mutable, the hash code would have
// to be recalculated every time, breaking HashMap behavior.