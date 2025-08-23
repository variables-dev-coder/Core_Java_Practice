package revision_4;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");      // adds at the end
        sb.insert(5, " Java");    // insert at index 5
        sb.replace(6, 10, "C++"); // replace characters
        sb.delete(0, 5);          // delete characters
        sb.reverse();             // reverse string

        System.out.println(sb);   // final result
    }
}

/*
Topic 11: StringBuffer and StringBuilder
In Java, apart from String (immutable), we have StringBuffer and
StringBuilder which are mutable (modifiable) classes used for string manipulation.

Key Differences

| Feature       | String          | StringBuffer       | StringBuilder         |
| ------------- | --------------- | ------------------ | --------------------- |
| Mutability    | Immutable       | Mutable            | Mutable               |
| Thread-Safety | Yes (immutable) | Yes (synchronized) | No (not synchronized) |
| Performance   | Moderate        | Slower than SB     | Faster                |


dlroW++C avaJ

 */