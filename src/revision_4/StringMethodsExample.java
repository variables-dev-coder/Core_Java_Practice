package revision_4;

public class StringMethodsExample {
    public static void main(String[] args) {
        String s = "Programming";

        System.out.println("1. Length: " + s.length());              // 11
        System.out.println("2. charAt(2): " + s.charAt(2));          // o
        System.out.println("3. substring(0, 6): " + s.substring(0, 6)); // Progra
        System.out.println("4. indexOf(\"g\"): " + s.indexOf("g"));  // 3
        System.out.println("5. lastIndexOf(\"g\"): " + s.lastIndexOf("g")); // 10
        System.out.println("6. contains(\"gram\"): " + s.contains("gram")); // true
        System.out.println("7. startsWith(\"Pro\"): " + s.startsWith("Pro")); // true
        System.out.println("8. endsWith(\"ing\"): " + s.endsWith("ing"));   // true
    }
}

/*
1. Length: 11
2. charAt(2): o
3. substring(0, 6): Progra
4. indexOf("g"): 3
5. lastIndexOf("g"): 10
6. contains("gram"): true
7. startsWith("Pro"): true
8. endsWith("ing"): true


Topic 5: Important String Methods
Explanation

Some of the most frequently used String methods in Java are:

1.length() → returns number of characters.
2.charAt(index) → returns character at a given index.
3.substring(begin, end) → extracts part of a string (end is exclusive).
4.indexOf(str) / lastIndexOf(str) → finds position of substring.
5.contains(str) → checks if substring exists.
6.startsWith(str) / endsWith(str) → prefix/suffix check.

Dry Run

"Programming".length() → 11.
charAt(2) → index starts at 0 → P(0) r(1) o(2) → 'o'.
substring(0,6) → "Progra".
indexOf("g") → first g at index 3.
lastIndexOf("g") → last g at index 10.
contains("gram") → true.
startsWith("Pro") → true.
endsWith("ing") → true.


 */