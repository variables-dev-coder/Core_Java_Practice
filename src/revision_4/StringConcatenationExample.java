package revision_4;

public class StringConcatenationExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        // 1. Using + operator
        String result1 = s1 + " " + s2;
        System.out.println("Using + : " + result1);

        // 2. Using concat()
        String result2 = s1.concat(" ").concat(s2);
        System.out.println("Using concat() : " + result2);

        // 3. Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2);
        String result3 = sb.toString();
        System.out.println("Using StringBuilder : " + result3);
    }
}

/*
Using + : Hello World
Using concat() : Hello World
Using StringBuilder : Hello World

Topic 4: String Concatenation
Explanation
Concatenation joins strings.

3 ways in Java:
1.Using + operator.
2.Using concat() method.
3.Using StringBuilder / StringBuffer (efficient for loops).

Behind the scenes:
At compile-time, "a" + "b" → "ab" (compiler optimization).
At runtime, Java uses StringBuilder.append() for + concatenation.

Dry Run
1.s1 + " " + s2 → runtime → compiler generates new StringBuilder().append(s1).append(" ").append(s2).toString().
2.concat() → creates new string "Hello World".
3.StringBuilder → efficient for repeated concatenation (e.g., in loops).



 */