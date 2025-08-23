package revision_4;

public class StringBufferExampleClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // 1. Append
        sb.append(" World");
        System.out.println("Append: " + sb); // Hello World

        // 2. Insert
        sb.insert(6, "Java ");
        System.out.println("Insert: " + sb); // Hello Java World

        // 3. Replace
        sb.replace(6, 10, "C++");
        System.out.println("Replace: " + sb); // Hello C++ World

        // 4. Delete
        sb.delete(6, 10);
        System.out.println("Delete: " + sb); // Hello  World

        // 5. Reverse
        sb.reverse();
        System.out.println("Reverse: " + sb); // dlroW  olleH

        // 6. Capacity
        System.out.println("Capacity: " + sb.capacity());
    }
}

/*
What is StringBuffer?

    String is immutable, but StringBuffer is mutable (can be changed without creating a new object).
    Used when you need to modify strings frequently (append, insert, delete, etc.).
    Thread-safe (synchronized) → multiple threads can access safely.

Common Methods of StringBuffer

1.append(String s) → adds text at the end.
2.insert(int offset, String s) → inserts text at given position.
3.replace(int start, int end, String s) → replaces part of the string.
4.delete(int start, int end) → removes characters from start to end-1.
5.reverse() → reverses the string.
6.capacity() → shows current buffer capacity.
7.ensureCapacity(int minCapacity) → increases capacity if required.


Key Notes:

Use StringBuffer when you need thread-safe operations.
If thread-safety is not required, prefer StringBuilder (faster).
 */