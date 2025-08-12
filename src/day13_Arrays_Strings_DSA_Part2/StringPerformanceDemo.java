package day13_Arrays_Strings_DSA_Part2;


/*
3. Performance Trade-offs of String Immutability
Question:
Since Strings are immutable, repeated concatenation creates new objects.
Write a program to show performance differences between using String and StringBuilder for concatenation in a loop.

Key Points Tested:
Understanding of immutability's cost in concatenation
Importance of StringBuilder/StringBuffer
Big-O performance awareness
 */

public class StringPerformanceDemo {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String (Immutable → new object for each concat)
        String str = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            str += "a"; // creates new String each time → slow
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime) + " ms");

        // Using StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            sb.append("a"); // modifies in place → fast
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");
    }
}

//String Time: 238 ms
//StringBuilder Time: 4 ms

/*
Explanation:
String is immutable, so str += "a" creates a new object each time → O(n²) complexity.
StringBuilder is mutable, modifies in place → O(n) complexity, much faster.
In loops, always prefer StringBuilder for concatenation.
 */