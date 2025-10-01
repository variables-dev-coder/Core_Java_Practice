package day66_Streams_API;

public class Notes {
    public static void main(String[] args) {

        /*

1. Stream Basics
-----------------
    Streams represent a sequence of elements that supports functional-style operations.
    They do not store data, they operate on a source (like Collection, Array).
    Streams are lazy; operations are executed only when a terminal operation is invoked.

Key Characteristics:
--------------------
    No storage (don't modify source)
    Functional-style operations (map, filter, reduce)
    Can be parallel for multi-core processing



2. Stream Creation
------------------

a) From Collections

import java.util.*;
import java.util.stream.*;

List<String> list = Arrays.asList("Munna", "Aziz", "Java");
Stream<String> stream1 = list.stream();
Stream<String> parallelStream = list.parallelStream();


b) From Arrays

String[] arr = {"Munna", "Aziz", "Java"};
Stream<String> stream2 = Arrays.stream(arr);


c) Using Stream.of()

Stream<String> stream3 = Stream.of("Munna", "Aziz", "Java");


3. Intermediate vs Terminal Operations
--------------------------------------
    Intermediate operations → lazy, return a new stream
        Examples: map(), filter(), flatMap(), distinct(), sorted(), limit(), skip(), peek()

    Terminal operations → trigger execution, return non-stream value
        Examples: forEach(), collect(), count(), reduce(), anyMatch(), allMatch()


4. map() – Transforming Elements
--------------------------------
    Purpose: Transform each element of the stream.
    Can use lambdas or method references.

List<String> names = Arrays.asList("munna", "aziz", "java");
List<String> upper = names.stream()
                          .map(String::toUpperCase) // Method reference
                          .toList();
System.out.println(upper); // [MUNNA, AZIZ, JAVA]



Nested mapping (objects inside objects)


class Employee {
    String name;
    Department dept;
    Employee(String n, Department d){ name=n; dept=d;}
}
class Department {
    String deptName;
    Department(String d){ deptName=d;}
}

List<Employee> employees = List.of(new Employee("Munna", new Department("IT")));

List<String> deptNames = employees.stream()
                                  .map(emp -> emp.dept.deptName)
                                  .toList();
System.out.println(deptNames); // [IT]



Mapping to other data types



List<String> numbers = List.of("1","2","3");
List<Integer> intList = numbers.stream()
                               .map(Integer::parseInt)
                               .toList();


5. filter() – Keeping Elements Based on Condition
-------------------------------------------------
List<Integer> numbers = List.of(1,2,3,4,5,6);
List<Integer> even = numbers.stream()
                            .filter(n -> n % 2 == 0)
                            .toList();
System.out.println(even); // [2, 4, 6]


6. flatMap() – Flattening Nested Collections
--------------------------------------------

List<List<String>> nestedList = List.of(
    List.of("Munna", "Aziz"),
    List.of("Java", "Streams")
);

List<String> flat = nestedList.stream()
                              .flatMap(List::stream)
                              .toList();
System.out.println(flat); // [Munna, Aziz, Java, Streams]



7. distinct(), sorted(), limit(), skip()
----------------------------------------
List<Integer> nums = List.of(5,3,5,2,1,3);

List<Integer> result = nums.stream()
                           .distinct()           // Remove duplicates
                           .sorted()             // Sort ascending
                           .skip(1)              // Skip first
                           .limit(3)             // Take next 3
                           .toList();
System.out.println(result); // [2,3,5]



8. forEach() & peek()
---------------------
forEach() → terminal operation for consuming elements

List<String> names = List.of("Munna", "Aziz");
names.stream().forEach(System.out::println);

peek() → intermediate operation for debugging/logging

List<String> upperNames = names.stream()
                               .peek(n -> System.out.println("Before map: " + n))
                               .map(String::toUpperCase)
                               .peek(n -> System.out.println("After map: " + n))
                               .toList();


9. Collectors (Part 1)
----------------------
a) collect() – Convert Stream to Collection

List<String> list = List.of("Munna", "Aziz", "Java");
List<String> collected = list.stream()
                             .map(String::toUpperCase)
                             .collect(Collectors.toList());
Set<String> set = list.stream().collect(Collectors.toSet());


b) toMap() – Collect to Map

List<String> names = List.of("Munna", "Aziz");
Map<String, Integer> nameLength = names.stream()
                                       .collect(Collectors.toMap(
                                           name -> name,
                                           name -> name.length()
                                       ));
System.out.println(nameLength); // {Munna=5, Aziz=4}



Key Mastery Tips for Streams
============================
    1.Always prefer streams over loops for functional-style code.
    2.Lazy execution: Intermediate operations are not executed until terminal operation is invoked.
    3.Immutable approach: Streams do not modify the original collection.
    4.Method references improve readability.
    5.flatMap is essential for nested collections (lists of lists).
    6.Collectors → essential for aggregation (List, Set, Map).
    7.Combine operations: e.g., list.stream().filter(...).map(...).distinct().sorted().collect(...)



=============================================================================================================



Streams API – Interview Questions & Answers
============================================


Q1. What is a Stream in Java?
------------------------------
Answer:
    A Stream is a sequence of elements supporting functional-style operations.
    Streams do not store data; they operate on a source (collections, arrays).
    Streams support lazy evaluation, parallel processing, and functional operations like map, filter, reduce.


Q2. What is the difference between Intermediate and Terminal Operations?

Answer:

| Operation Type | Description                                 | Examples                                                                                  |
| -------------- | ------------------------------------------- | ----------------------------------------------------------------------------------------- |
| Intermediate   | Lazy, return Stream, can be chained         | `map()`, `filter()`, `flatMap()`, `distinct()`, `sorted()`, `peek()`, `limit()`, `skip()` |
| Terminal       | Trigger execution, return non-Stream result | `collect()`, `forEach()`, `reduce()`, `count()`, `anyMatch()`, `allMatch()`               |


Q3. What is map() in streams?
Answer:
    Transforms each element of the stream into another form.
    Can map to same type or another type using lambda or method reference.

Example:

List<String> names = List.of("munna", "aziz");
List<String> upper = names.stream()
                          .map(String::toUpperCase)
                          .toList();


Q4. What is the difference between map() and flatMap()?
Answer:
    map() → transforms each element to one element.
    flatMap() → transforms each element to a stream of elements, then flattens.

Example:

List<List<String>> nested = List.of(List.of("a","b"), List.of("c","d"));
List<String> flat = nested.stream()
                          .flatMap(List::stream)
                          .toList(); // [a,b,c,d]


Q5. How do you remove duplicates from a Stream?
Answer:
Use distinct() method.

List<Integer> nums = List.of(1,2,2,3);
nums.stream().distinct().toList(); // [1,2,3]


Q6. How do you sort a Stream?
Answer:
Use sorted().
    Default natural order: sorted()
    Custom comparator: sorted(Comparator.reverseOrder())

Example:

List<Integer> nums = List.of(1,2,3,4,5);
nums.stream().skip(2).limit(2).toList(); // [3,4]


Q8. Difference between forEach() and peek()?
Answer:
| Method  | Type         | Purpose                                                     |
| ------- | ------------ | ----------------------------------------------------------- |
| forEach | Terminal     | Consumes elements for side-effects                          |
| peek    | Intermediate | Mainly for debugging or observing elements while processing |


Q9. How do you collect stream results into a collection?
Answer:
Use collect() with Collectors:

List<String> list = stream.collect(Collectors.toList());
Set<String> set = stream.collect(Collectors.toSet());
Map<String,Integer> map = list.stream()
                              .collect(Collectors.toMap(s -> s, s -> s.length()));


Q10. Can streams be reused?
Answer:
❌ No. Streams cannot be reused once a terminal operation is called.
    You must recreate the stream from the source to perform another operation.


Q11. How can you convert a Stream of objects to another type?
Answer:
Use map() with method references or lambdas.

List<String> numbers = List.of("1","2","3");
List<Integer> ints = numbers.stream()
                            .map(Integer::parseInt)
                            .toList();


Q12. How do streams improve performance?
Answer:
    Streams support lazy evaluation → intermediate operations are not executed until terminal operation.
    Streams can run in parallel using parallelStream().
    Functional style reduces boilerplate code, improving readability and maintainability.



         */
    }
}
