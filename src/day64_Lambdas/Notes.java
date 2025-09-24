package day64_Lambdas;

public class Notes {
    public static void main(String[] args) {

        /*

1. What is a Lambda Expression?
-------------------------------
    A Lambda Expression is a short block of code that takes in parameters and returns a value.
    It’s like an anonymous function (no name, no modifiers, no return type).

General Syntax:

(parameters) -> expression
(parameters) -> { statements }

Examples:

// Traditional anonymous class
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Hello from Runnable!");
    }
};

// Lambda version
Runnable r2 = () -> System.out.println("Hello from Lambda!");


===================================================================================



2. Scope and Capturing Variables
--------------------------------
    Local variables used inside a lambda must be final or effectively final.
    Lambdas can access:
    ✅ Parameters
    ✅ Instance variables
    ✅ Static variables

Example:

public class LambdaScope {
    int instanceVar = 10;

    public void test() {
        int localVar = 20; // effectively final

        Runnable r = () -> {
            System.out.println("Instance Var: " + instanceVar);
            System.out.println("Local Var: " + localVar);
        };

        r.run();
    }

    public static void main(String[] args) {
        new LambdaScope().test();
    }
}

Instance Var: 10
Local Var: 20

============================================================================


3. Functional Interfaces (@FunctionalInterface)
-----------------------------------------------
A Functional Interface (FI) is an interface with exactly one abstract method (SAM).
    Can have default and static methods too.
    Annotated with @FunctionalInterface (optional, but gives compiler check).

Example:

@FunctionalInterface
interface MyFunctionalInterface {
    void greet(); // Single abstract method
}

public class TestFI {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("Hello!");
        obj.greet();
    }
}


=============================================================================


4. Built-in Functional Interfaces
---------------------------------
Java provides many FIs inside java.util.function package.
The most common are:

✅ Predicate<T>
    Tests a condition (returns boolean).

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // true
    }
}


✅ Function<T, R>
    Takes input T, returns output R.

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Munna")); // 5
    }
}


✅ Consumer<T>
    Takes input, returns nothing.

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println("Hello " + s);
        printer.accept("Munna");
    }
}


✅ Supplier<T>
    Takes no input, returns a value.

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}


Summary (Day 2)
    Lambdas → Anonymous functions (args) -> body.
    Scope → Can access local variables (final/effectively final), instance/static variables.
    Functional Interface → Exactly one abstract method.
    Built-in FIs → Predicate, Function, Consumer, Supplier.


=======================================================================


Interview Questions & Answers
=============================

1. What is a Lambda Expression in Java?
---------------------------------------
    A lambda is a short block of code (anonymous function) that can be passed around as data.
    Introduced in Java 8 to bring functional programming style.

Syntax:

    (parameters) -> expression
    (parameters) -> { statements }



2. What problem do Lambdas solve in Java?
------------------------------------------
    Before Java 8, we used anonymous inner classes → very verbose.
    Lambdas provide a concise way to write code for functional interfaces.

Example:

// Before (anonymous class)
Runnable r1 = new Runnable() {
    public void run() { System.out.println("Hello"); }
};

// After (lambda)
Runnable r2 = () -> System.out.println("Hello");



3. What is a Functional Interface?
----------------------------------
    A Functional Interface (FI) is an interface with exactly one abstract method (SAM – Single Abstract Method).
        Can have default/static methods.
        Marked with @FunctionalInterface (optional but compiler checks it).

Example:

    @FunctionalInterface
    interface MyInterface {
        void execute();
    }


--------------------------------------------------------------------------


4. Can a Functional Interface have multiple methods?
----------------------------------------------------
    It can have only one abstract method.
    But it can have any number of default or static methods.


-----------------------------------------------------------------------------


5. What are some Built-in Functional Interfaces in Java?
-------------------------------------------------------
    Predicate<T> → test condition, returns boolean
    Function<T,R> → takes input, returns output
    Consumer<T> → takes input, returns nothing
    Supplier<T> → takes no input, returns value



--------------------------------------------------------------------------



6. What is the difference between Predicate and Function?
--------------------------------------------------------
    Predicate<T> → input T, output boolean
    Function<T,R> → input T, output R (any type)

------------------------------------------------------------------------------


7. What is “effectively final” in Lambdas?
------------------------------------------
    A local variable used inside a lambda must not change after initialization (it’s treated as final).

Example:

    int num = 10; // effectively final
    Runnable r = () -> System.out.println(num); // OK

If you modify num after lambda definition → compiler error.



-----------------------------------------------------------------------------


8. Can Lambdas access instance and static variables?
----------------------------------------------------

    ✅ Yes, lambdas can access both instance and static variables.

    But local variables inside method must be final or effectively final.



-----------------------------------------------------------------------------



9. Difference between Lambda Expressions and Anonymous Inner Classes?
---------------------------------------------------------------------
    Lambdas → concise, can only be used with functional interfaces.
    Anonymous classes → verbose, can have multiple methods.
    this keyword → in a lambda refers to the enclosing class, in an anonymous class it refers to the class itself.




---------------------------------------------------------------------------------



10. Why is Functional Programming useful in Java 8+?
----------------------------------------------------
    Makes code cleaner & concise.
    Easy to parallelize streams.
    Reduces boilerplate anonymous classes.
    Encourages immutability and declarative style.



         */
    }
}
