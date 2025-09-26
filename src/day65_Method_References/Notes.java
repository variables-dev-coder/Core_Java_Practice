package day65_Method_References;

public class Notes {
    public static void main(String[] args) {

        /*

Day 3 – Method References in Java (Mastery Level)
=================================================

1. What is a Method Reference?
------------------------------
A method reference is a short-hand syntax for a lambda expression that calls an existing method.
It makes the code more readable and concise.

General Syntax:

ClassName::methodName
instance::methodName
ClassName::new

Key Rule:
    Can be used only when lambda expression just calls an existing method.



2. Types of Method References
-----------------------------
    1.Static Method References

Syntax:

    ClassName::staticMethodName

Example:

import java.util.*;
import java.util.function.Function;

public class StaticMethodRef {
    public static void main(String[] args) {
        Function<String, Integer> converter = Integer::parseInt; // Static method reference
        System.out.println(converter.apply("123")); // 123
    }
}

Equivalent Lambda:

Function<String, Integer> converter = s -> Integer.parseInt(s);


    2.Instance Method References

    Two types:

    a) Reference to an instance method of a particular object
            instance::methodName

import java.util.function.Consumer;

public class InstanceMethodRef {
    public static void main(String[] args) {
        String prefix = "Hello, ";
        Consumer<String> greeter = prefix::concat; // returns new string but used in lambda
        System.out.println(greeter.apply("Munna")); // Cannot print directly, need function returning value
    }
}

Better example with System.out instance:

Consumer<String> printer = s -> System.out.println(s);


        b) Reference to an instance method of an arbitrary object of a particular type
            Syntax:
            ClassName::methodName

import java.util.*;
public class ArbitraryInstanceMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Munna", "Aziz", "Java");
        names.sort(String::compareToIgnoreCase); // Instance method reference
        System.out.println(names); // [Aziz, Java, Munna]
    }
}


Equivalent Lambda:

names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));


    3. Constructor References

Syntax:
ClassName::new

Can be used with Supplier or Function to create new objects.

Helps avoid verbose lambdas.

Example:

import java.util.function.Supplier;

class Person {
    String name;
    Person() { this.name = "Munna"; }
    @Override
    public String toString() { return name; }
}

public class ConstructorRef {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new; // Constructor reference
        Person p = personSupplier.get();
        System.out.println(p); // Munna
    }
}

Equivalent Lambda:

Supplier<Person> personSupplier = () -> new Person();

With Parameterized Constructor:

import java.util.function.Function;

class Person {
    String name;
    Person(String name) { this.name = name; }
    public String toString() { return name; }
}

public class ConstructorParamRef {
    public static void main(String[] args) {
        Function<String, Person> personCreator = Person::new;
        Person p = personCreator.apply("Aziz");
        System.out.println(p); // Aziz
    }
}




3. Key Mastery Tips
-------------------
1. When to use:
       Lambda only calls a method → replace with method reference.

2. Improves readability:
       list.sort(String::compareTo) is cleaner than (a,b) -> a.compareTo(b)

3. Works with Streams:

List<String> names = Arrays.asList("Munna","Aziz","Java");
names.stream().map(String::toUpperCase).forEach(System.out::println);

4. Three common method reference types to remember:

| Type | Syntax | Example |
|------|--------|---------|
| Static method | ClassName::staticMethod | Integer::parseInt |
| Instance method | instance::method | System.out::println |
| Arbitrary instance | ClassName::instanceMethod | String::toUpperCase |
| Constructor | ClassName::new | Person::new |

5. Rules:
    Cannot use a method reference if lambda does more than just calling a method.
    Compatible only with functional interfaces.


Method References – Interview Q&A
==================================

Q1. What is a Method Reference in Java? How is it different from a Lambda Expression?
Answer:
    A method reference is shorthand for a lambda expression that only calls an existing method.
    Lambda: (s) -> s.toUpperCase()
    Method Reference: String::toUpperCase

✔ Method references make code shorter and more readable, but they cannot add extra logic like lambdas can.


========================================================================================================


Q2. What are the different types of method references?
Answer:
    1.Static Method Reference → ClassName::staticMethod
    2.Instance Method Reference (specific object) → instance::methodName
    3.Instance Method Reference (arbitrary object of type) → ClassName::methodName
    4.Constructor Reference → ClassName::new



==========================================================================================================


Q3. Can a method reference be used without a functional interface?
Answer:
    No.
    Method references require a functional interface (SAM – Single Abstract Method interface) as a target.
    Example:

    Supplier<Person> p = Person::new;


============================================================================================================


Q4. When should you prefer method references over lambdas?
Answer:
    Use method references when the lambda expression just calls an existing method.
    Improves readability
    Reduces boilerplate
    If you need extra logic, use a lambda.


============================================================================================================



Q5. Give an example of a static method reference.
Answer:
    Function<String, Integer> f = Integer::parseInt;
    System.out.println(f.apply("123")); // 123


============================================================================================================


Q6. Can you reference an overloaded method with method references?
Answer:
    Yes , but the compiler must be able to resolve it based on context (target functional interface type).
    Example:
    Function<String, Integer> f = Integer::parseInt; // resolves correctly

If ambiguity exists, you must use a lambda instead.



============================================================================================================


Q7. How do constructor references work?
Answer:
    Constructor references use ClassName::new.
    They map directly to a Supplier (no args) or Function (with args).
    Example:

    Supplier<Person> s = Person::new;
    Person p = s.get();


=============================================================================================================


Q8. What is the difference between System.out::println and (x) -> System.out.println(x)?
Answer:
    Both are equivalent.
        (x) -> System.out.println(x) is a lambda.
        System.out::println is a method reference.
        The method reference is shorter and clearer.


============================================================================================================



Q9. Can method references capture variables like lambdas?
Answer:
    Yes.
    Method references follow the same rules as lambdas. They can access final or effectively
    final variables from enclosing scope.



============================================================================================================


Q10. Give a real-world example using method references in Streams.
Answer:

    List<String> names = Arrays.asList("Munna", "Aziz", "Java");
    names.stream().map(String::toUpperCase).forEach(System.out::println);
    ✔ Cleaner than writing (s) -> s.toUpperCase() and (s) -> System.out.println(s).


============================================================================================================



         */
    }
}
