package day60_Java_Memory_Model;

public class Notes {
    public static void main(String[] args) {


        /*

Introduction to the Java Memory Model (JMM)
-------------------------------------------
The Java Memory Model (JMM) defines how Java programs run in memory and how threads interact with memory.

At the most basic level, memory in Java is divided into two key parts:
    1.Stack Memory (for execution flow, method calls, local variables)
    2.Heap Memory (for objects and dynamic memory allocation)




1. Stack Memory
---------------
Think of Stack as the workspace of a single thread.
    Thread-specific: Each thread has its own stack, independent from others.
    Stores:
        Method calls (execution frames)
        Local variables (primitives, object references)
        Return addresses

    LIFO (Last In, First Out): Like a stack of plates — the last method called is the first to finish.
    Automatic cleanup: When a method ends, its stack frame is popped and memory is freed automatically.
    Fast access: Because it’s managed per-thread and small, stack operations are very fast.

Example:

public class StackExample {
    public static void main(String[] args) {
        int x = 10;           // stored in Stack
        int y = 20;           // stored in Stack
        int sum = add(x, y);  // method call creates new stack frame
        System.out.println(sum);
    }

    static int add(int a, int b) {
        int result = a + b;   // local variable in Stack
        return result;
    }
}

Each method (main, add) gets its own stack frame.
When add() finishes, its frame is popped out, memory freed.



2. Heap Memory
--------------

Think of Heap as the storage warehouse of all objects.
Shared among all threads: Unlike stack, there’s only one heap per JVM.
Stores:
    Objects (new)
    Instance variables
    Arrays
Managed by Garbage Collector (GC): Objects stay until they are no longer referenced.
Slower than stack (because it’s larger and GC works on it).

Example:

class Person {
    String name;
}

public class HeapExample {
    public static void main(String[] args) {
        Person p1 = new Person();  // object stored in Heap
        p1.name = "Munna";         // instance variable in Heap
    }
}

p1 (reference variable) lives in Stack.

Actual Person object lives in Heap.

If p1 goes out of scope (e.g., method ends) and no references exist → GC will reclaim that memory.


Stack vs Heap (Comparison)
--------------------------

| Feature          | Stack Memory                               | Heap Memory                              |
| ---------------- | ------------------------------------------ | ---------------------------------------- |
| **Scope**        | Thread-local (private to each thread)      | Shared across all threads                |
| **Stores**       | Method calls, local variables, references  | Objects, instance variables, arrays      |
| **Size**         | Smaller                                    | Larger                                   |
| **Allocation**   | Happens when methods are called            | Happens when objects are created (`new`) |
| **Access Speed** | Very fast                                  | Slower                                   |
| **Lifecycle**    | Auto-freed after method ends               | Freed only when GC runs                  |
| **Errors**       | StackOverflowError (too many nested calls) | OutOfMemoryError (Heap full)             |



Diagram Representation
-----------------------

Stack (per-thread)               Heap (shared)

main() frame  ────────────┐
   x = 10                 │
   y = 20                 │
   p1 (ref) ──────────────┼─────────> [Person object]
                          │              name = "Munna"
add() frame ──────────────┘
   a = 10
   b = 20
   result = 30



Real-World Analogy
------------------
Stack = To-do list on your desk
    Temporary, personal, auto-cleared when you finish tasks.
Heap = Warehouse
    Shared storage for all employees (threads), needs a cleanup team (GC).



Master-Level Insights
======================
1.Primitives vs References
    Primitives (int, double, char) → always on the stack.
    References (String, objects, arrays) → reference in stack, actual object in heap.

2.Escape Analysis (JIT Optimization)
    Sometimes the JVM optimizes small objects to stay in the stack if they don’t “escape” the method.
    (Advanced JIT optimization).

3.Multi-threading
    Each thread has its own stack → no data clash.
    All threads share the heap → synchronization needed for thread safety.

4.Errors to remember
    Too many recursive calls → StackOverflowError.
    Creating huge objects without freeing → OutOfMemoryError: Java heap space.


Interview Questions (Theory)
=============================


1.What is the difference between Stack and Heap memory in Java?
    Cover scope, lifetime, thread safety, speed.

2.Where are local variables, object references, and objects stored?
    Locals + references → Stack, Objects → Heap.

3.Can two threads share the same stack?
    No, each thread has its own stack. Heap is shared.

4.What happens if stack memory is full?
    StackOverflowError.

5.What happens if heap memory is full?
    OutOfMemoryError: Java heap space.

6.Is String stored in the stack or heap?
    String objects → Heap (except literals in String pool area).
    Reference → Stack.

7.What role does Garbage Collector play in heap management?
    Frees unreachable objects from the heap.

8.What is stored inside a stack frame?
    Local variables, references, return address, partial results.

9.What is faster: stack access or heap access? Why?
    Stack is faster (LIFO, no GC involvement).

10.What is Escape Analysis in JVM?
    Optimization where small objects may be allocated on the stack instead of heap if they don’t escape method scope.



5 Coding-based Conceptual Questions
What happens in memory when you create an object with new?
Write code to cause a StackOverflowError.
Write code to cause an OutOfMemoryError using the heap.
Show the difference between primitive vs reference variable storage.
Explain, with code, how two references can point to the same heap object.




         */
    }
}
