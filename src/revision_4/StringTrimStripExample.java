package revision_4;

public class StringTrimStripExample {
    public static void main(String[] args) {
        String s1 = "   Hello World   ";
        String s2 = "\u2002Hello\u2002";  // Unicode space (en-space)
        String s3 = "   ";                // spaces only
        String s4 = "";                   // empty string

        System.out.println("1. trim(): '" + s1.trim() + "'");
        System.out.println("2. strip(): '" + s2.strip() + "'");
        System.out.println("3. stripLeading(): '" + s1.stripLeading() + "'");
        System.out.println("4. stripTrailing(): '" + s1.stripTrailing() + "'");
        System.out.println("5. isBlank() on s3: " + s3.isBlank());
        System.out.println("6. isEmpty() on s3: " + s3.isEmpty());
        System.out.println("7. isEmpty() on s4: " + s4.isEmpty());
    }
}

/*
1. trim(): 'Hello World'
2. strip(): 'Hello'
3. stripLeading(): 'Hello World   '
4. stripTrailing(): '   Hello World'
5. isBlank() on s3: true
6. isEmpty() on s3: false
7. isEmpty() on s4: true


Topic 6: Trim, Strip, and Blank-check Methods
Explanation

These methods help clean up and validate whitespace in Strings:

1.trim()
    Removes only leading and trailing spaces (U+0020).
    Doesn’t handle all kinds of Unicode whitespace.

2.strip() (Java 11+)
    Removes all Unicode whitespace from both ends.
    More powerful than trim().

3.stripLeading() / stripTrailing() (Java 11+)
    Removes whitespace only from start or end.

4.isBlank() (Java 11+)
    Returns true if string is empty or contains only whitespace.

5.isEmpty()
    Returns true if length is 0 (doesn’t consider whitespace).

Dry Run

1.s1.trim() → "Hello World" (normal spaces removed).
2.s2.strip() → removes Unicode en-space → "Hello".
3.s1.stripLeading() → "Hello World " (only start spaces removed).
4.s1.stripTrailing() → " Hello World" (only end spaces removed).
5.s3.isBlank() → true (only spaces).
6.s3.isEmpty() → false (length = 3).
7.s4.isEmpty() → true (length = 0).


 */