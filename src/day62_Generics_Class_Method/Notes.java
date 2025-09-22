package day62_Generics_Class_Method;

public class Notes {
    public static void main(String[] args) {
        /*

1. What are Generics?
---------------------
Generics allow you to write code that works with any type while maintaining type safety.
Instead of writing multiple versions of the same class or method for different data types,
you can write one generic version.

Example without Generics (not type-safe):

ArrayList list = new ArrayList();
list.add("Hello");
list.add(100); // Allowed, but dangerous


With Generics (type-safe):

ArrayList<String> list = new ArrayList<>();
list.add("Hello");
// list.add(100); // Compile-time error



2. Generic Classes
------------------

A Generic Class is a class that takes a type parameter.

Syntax:

class ClassName<T> {
    private T data;  // T can be any type

    public ClassName(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}


Example:

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        Box<String> strBox = new Box<>("Hello Generics");

        System.out.println(intBox.getValue());  // 123
        System.out.println(strBox.getValue()); // Hello Generics
    }
}

Here T is a type parameter.
You can create Box<Integer>, Box<String>, etc.


3. Generic Methods
------------------
A Generic Method allows you to create a method that works with different data types without rewriting it.

Syntax:

public <T> void methodName(T param) {
    // T can be any type
}

Example:

class GenericExample {
    // Generic Method
    public <T> void printData(T data) {
        System.out.println("Data: " + data);
    }

    // Generic Method with return type
    public <T> T getData(T data) {
        return data;
    }
}

public class Main {
    public static void main(String[] args) {
        GenericExample example = new GenericExample();

        example.printData("Hello");   // Data: Hello
        example.printData(123);       // Data: 123
        example.printData(45.67);     // Data: 45.67

        System.out.println(example.getData("Test"));  // Test
    }
}

Here <T> before return type tells Java this is a generic method.
Method works with any type (String, Integer, Double).


4. Key Points
-------------
Generic classes and methods improve reusability and type safety.
Type parameters can be named anything, but conventionally:
    T → Type
    E → Element (used in collections)
    K → Key
    V → Value


3.Bounded Type Parameters
--------------------------

By default, a type parameter <T> can be any type (Object, String, Integer, etc.).
But sometimes you want to restrict it to certain classes (usually subclasses of a type).

Syntax:

<T extends SuperClass>

Means: T can only be SuperClass or its subclasses.
If interface, <T extends Interface> means T must implement that interface.

Example: Only allow numbers

class Calculator<T extends Number> {   // T must be Number or subclass
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator<>(10, 20);
        Calculator<Double> c2 = new Calculator<>(5.5, 4.5);
        // Calculator<String> c3 = new Calculator<>("a", "b"); ❌ Not allowed

        System.out.println(c1.add()); // 30.0
        System.out.println(c2.add()); // 10.0
    }
}

Restricts types to numbers only.
Prevents wrong usage (String not allowed).


4. Type Inference & Diamond Operator (<>)
-----------------------------------------
Type inference means Java compiler automatically detects the type parameter.

Before Java 7:

Box<Integer> b = new Box<Integer>(123);

From Java 7 onwards:

Box<Integer> b = new Box<>(123); // Diamond operator <>

Java 8+ (method calls):

class Util {
    public static <T> T printAndReturn(T data) {
        System.out.println(data);
        return data;
    }
}

public class Main {
    public static void main(String[] args) {
        String result = Util.printAndReturn("Hello"); // Type inferred = String
        Integer num   = Util.printAndReturn(100);     // Type inferred = Integer
    }
}


Compiler figures out the type automatically.
Diamond operator < > makes code cleaner.


4. Wildcards
------------

Wildcards allow flexible use of generics.
Sometimes you don’t care about the exact type, but just want to allow multiple possibilities.


(a) Unbounded Wildcard <?>

Means: any type.

public void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
    }
}


Usage:

List<Integer> intList = Arrays.asList(1, 2, 3);
List<String> strList = Arrays.asList("A", "B", "C");

printList(intList); // Works
printList(strList); // Works

Useful when you don’t care about type, just want to read data.
You cannot add elements (except null), because type is unknown.


(b) Upper-Bounded Wildcard <? extends T>

Means: any type that is T or subclass of T.

public double sumOfList(List<? extends Number> list) {
    double sum = 0.0;
    for (Number n : list) {
        sum += n.doubleValue();
    }
    return sum;
}


Usage:

List<Integer> intList = Arrays.asList(1, 2, 3);
List<Double> doubleList = Arrays.asList(2.5, 3.5);

System.out.println(sumOfList(intList));   // 6.0
System.out.println(sumOfList(doubleList)); // 6.0


Used when you only need to read data.
Cannot safely add new elements (except null).


(c) Lower-Bounded Wildcard <? super T>

Means: any type that is T or superclass of T.

public void addNumbers(List<? super Integer> list) {
    list.add(10);
    list.add(20);
}


Usage:

List<Integer> intList = new ArrayList<>();
List<Number> numList = new ArrayList<>();

addNumbers(intList); // Works
addNumbers(numList); // Works

Used when you only add data (producers).
Reading is limited (only as Object).



Summary Table
---------------
| Concept                | Syntax                             | Use Case                      |
| ---------------------- | ---------------------------------- | ----------------------------- |
| Generic Class          | `class Box<T>`                     | Reusable class with any type  |
| Generic Method         | `<T> T method(T val)`              | Reusable method with any type |
| Bounded Type           | `<T extends Number>`               | Restrict type parameter       |
| Type Inference         | `Box<Integer> b = new Box<>(123);` | Compiler infers type          |
| Unbounded Wildcard     | `<?>`                              | Read from unknown type        |
| Upper-Bounded Wildcard | `<? extends T>`                    | Read (Producer)               |
| Lower-Bounded Wildcard | `<? super T>`                      | Write (Consumer)              |


Easy way to remember:

Producer Extends (? extends T) → read only.

Consumer Super (? super T) → write only.



Generics Interview Questions & Answers
========================================

1. What are Generics in Java and why are they used?

Answer:
Generics provide type safety and code reusability by allowing classes, interfaces,
and methods to operate on objects of various types while still being type-safe.
    Before Generics: You had to use Object and cast manually (risk of ClassCastException).
    With Generics: Compile-time type checking avoids runtime errors.


2. What is the difference between Generic Class and Generic Method?

Generic Class: Class is parameterized by type.
class Box<T> { T value; }

Generic Method: Method itself is parameterized by type.
public <T> T getValue(T val) { return val; }


3. Can Generics be used with primitive types?

Answer:
No, generics work only with objects, not primitives (int, double).
But Java uses autoboxing:
List<Integer> list = new ArrayList<>(); // int -> Integer


4. What is Type Erasure in Generics?

Answer:
Generics are implemented using type erasure. At compile-time, type parameters are
replaced with their bounds (or Object if unbounded).

Example:

List<String> list = new ArrayList<>();
list.add("A");


At runtime becomes:

List list = new ArrayList(); // type info erased

Generics exist only at compile-time.


5. What is the difference between <? extends T> and <? super T>?
    <? extends T> → Upper bound → Accepts T and its subclasses → used for reading (producer).
    <? super T> → Lower bound → Accepts T and its superclasses → used for writing (consumer).

Rule: Producer Extends, Consumer Super.


6. What is the difference between List<Object> and List<?>?
    List<Object> → list that holds only Object type (and you can insert Objects).
    List<?> → list of unknown type (could be List<String>, List<Integer>). You cannot insert into it except null.


7. What are bounded type parameters?

Answer:
Bounded types restrict the type parameter with extends (class/interface).

class Calculator<T extends Number> { ... }

Only allows Integer, Double, Float, etc. (subclasses of Number).


8. Can we overload methods when using Generics?

Answer:
Yes, but type erasure may cause compile-time ambiguity.

public void print(List<String> list) { }
public void print(List<Integer> list) { } // Compile error (erased to List)


9. Why can’t we create Generic arrays in Java?

List<String>[] arr = new ArrayList<String>[10]; // Compile error

Reason: Arrays are covariant and reified (runtime type info exists), but Generics use
type erasure. Mixing both causes heap pollution.


10. Can we use Generics with static methods or variables?

Answer:
    Static methods: Yes, but they must declare their own <T>.
    Static variables: No, because type parameter belongs to object, not class level.


11. What is the Diamond Operator (<>) in Generics?

Answer:
Introduced in Java 7, allows type inference:

List<String> list = new ArrayList<>(); // type inferred as String



12. What is PECS in Generics?

Answer:
PECS = Producer Extends, Consumer Super.
    If collection produces data → use extends.
    If collection consumes data → use super.


13. Can we create Generic Singleton class?

Answer:
Yes, but usually requires type casting. Example: Collections.emptyList() returns List<T> using casting internally.



14. How does Generics improve type safety at compile time?

Answer:
Compiler checks the type at compile-time.

List<String> list = new ArrayList<>();
list.add(123); // Compile-time error


15. Can we write multiple bounds in Generics?

Answer:
Yes. Syntax:

<T extends Class & Interface1 & Interface2>


Example:

class Demo<T extends Number & Comparable<T>> { ... }



Tricky Questions
=================


16. Difference between Comparator<T> and Comparable<T> with Generics?
    Comparable<T> → natural ordering of objects (within class).
    Comparator<T> → external ordering (separate class).


17. Can a generic method be overridden with different type parameters?

Yes, but type erasure may lead to overriding confusion.



18. How does Collections.copy() use Generics?

Signature:

public static <T> void copy(List<? super T> dest, List<? extends T> src)

Source produces (extends), destination consumes (super).



19. Can you create a method that accepts both List<Integer> and List<Double>?

Yes, using wildcards:

public void printNumbers(List<? extends Number> list) { ... }




20. Why are Generics not reified (erased at runtime)?

To ensure backward compatibility with older Java code (before Generics in Java 5).






         */
    }
}
