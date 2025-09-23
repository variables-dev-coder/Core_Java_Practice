package Day63_Functional_Programming_Basics;

public class Notes {
    public static void main(String[] args) {

        /*

1. What is Functional Programming?
----------------------------------
    Functional Programming (FP) is a programming paradigm where programs are built using
    functions instead of focusing on how to do things step by step (imperative).

In FP:

    ->Functions are first-class citizens (they can be stored in variables, passed as arguments,
        and returned from other functions).
    ->Focus is on what to do, not how to do it.
    ->Avoids mutable state (prefers immutability).
    ->Avoids side effects (functions should not change outside data).

In Java (since JDK 8), FP is enabled mainly by:
    Lambdas (functions as objects)
    Streams API (processing data in functional style)
    Functional Interfaces (Predicate, Function, etc.)



==================================================================================


2. Imperative vs Functional Style
---------------------------------
    Example: Find the square of even numbers in a list
    Imperative Style (Step-by-step, how to do it)

Imperative Style (Step-by-step, how to do it)


import java.util.*;

public class ImperativeExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (n % 2 == 0) {
                result.add(n * n);
            }
        }

        System.out.println(result); // [4, 16, 36]
    }
}

Tells how to do it step by step (loop, condition, add to list).
More boilerplate code.



Functional Style (Focus on what to do)


import java.util.*;
import java.util.stream.*;

public class FunctionalExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 == 0)   // keep even numbers
                                      .map(n -> n * n)           // square them
                                      .toList();

        System.out.println(result); // [4, 16, 36]
    }
}


Tells what to do (filter, map) instead of managing loops.
Cleaner, more declarative.



============================================================================================



3. Benefits of Functional Programming in Java 8+
-------------------------------------------------

✅ Cleaner and Concise Code
    Less boilerplate, more readable.

✅ Easier Parallelism
    Streams make parallel execution easy with .parallelStream().

✅ Better Modularity & Reusability
    Functions (Predicate, Function, etc.) can be reused.

✅ Encourages Immutability
    Reduces bugs from changing data accidentally.

✅ More Declarative
    Focuses on what to do, not how.

✅ Brings Java closer to Modern Languages
    Java competes with Scala, Kotlin, Python in FP support.


Summary of Day 1
FP = treating functions as values.
Java 8 introduced Lambdas + Streams to support FP.
Imperative = how to do, Functional = what to do.
Benefits: cleaner, parallelism, immutability, reusable, declarative.


Interview Questions
====================

1.What is Functional Programming in Java?
    Answer: A style of programming where functions are treated as first-class citizens.
    Introduced in Java 8 using Lambdas, Streams, and Functional Interfaces.


2.What is the main difference between Imperative and Functional style?

Answer:
    Imperative → Focuses on how to do it (step-by-step instructions, loops, mutable state).
    Functional → Focuses on what to do (uses functions, immutability, declarative style).


3.What is a Pure Function? Give an example.

    Answer: A function that always returns the same result for the same input and has no side effects.
    Example: int square(int n) { return n * n; }


4.Why is immutability preferred in functional programming?

    Answer: Immutability avoids unexpected changes in state, making programs easier
    to reason about, debug, and parallelize safely.



5.What are the benefits of using Functional Programming in Java 8+?
    Cleaner and concise code
    Easier parallel processing (parallelStream())
    Encourages immutability and thread-safety
    Improves reusability of function





         */
    }
}
