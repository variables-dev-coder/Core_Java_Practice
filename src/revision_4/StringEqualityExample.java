package revision_4;

public class StringEqualityExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";               // same pool object
        String s3 = new String("Hello");   // new heap object
        String s4 = "He" + "llo";          // compile-time optimization → pool

        System.out.println(s1 == s2);       // true (same pool reference)
        System.out.println(s1 == s3);       // false (heap vs pool)
        System.out.println(s1.equals(s3));  // true (content same)
        System.out.println(s1 == s4);       // true (compiler folds literal)
    }
}

/*
true
false
true
true


Topic 3: String Equality (== vs equals())
Explanation
== → compares references (memory addresses).
equals() → compares content of the string.
Because of the String pool, sometimes == may return true (if both refer to the same pooled object).
Best practice: always use equals() when checking content


Dry Run
1.s1 → "Hello" in pool.
2.s2 → same "Hello" in pool.
3.s3 → new object in heap, content "Hello".
4.s4 → "He" + "llo" optimized at compile-time → "Hello" in pool.


 */