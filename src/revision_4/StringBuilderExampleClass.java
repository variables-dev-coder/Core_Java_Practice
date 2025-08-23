package revision_4;

public class StringBuilderExampleClass {
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        // replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // delete()
        sb.delete(3, 8);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
    }
}

/*
After append: Hello World
After insert: Hello, Java World
After replace: Hi, Java World
After delete: Hi World
After reverse: dlroW iH
Capacity: 34
Capacity after ensureCapacity(50): 70


StringBuilder in Java

StringBuilder is a mutable sequence of characters (unlike String, which is immutable).
It allows modification of the content without creating new objects.
Faster than String when performing multiple modifications (like appending, inserting, deleting).
Not thread-safe (not synchronized). If you need thread safety, use StringBuffer.


When to use StringBuilder?

When frequent modifications (append, insert, delete, replace) are needed.
When thread-safety is not required.
For example, building dynamic SQL queries, processing strings in loops, etc.


 */