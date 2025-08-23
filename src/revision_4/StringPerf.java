package revision_4;

public class StringPerf {
    public static void main(String[] args) {
        long start, end;

        // Using String
        start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += i; // new object created every time
        }
        end = System.currentTimeMillis();
        System.out.println("String: " + (end - start) + " ms");

        // Using StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + " ms");

        // Using StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sbf.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + " ms");
    }
}

// Typically you’ll see StringBuilder ≪ StringBuffer ≪ String in terms of performance.

/*
String: 67 ms
StringBuilder: 0 ms
StringBuffer: 0 ms

Performance: String vs StringBuilder vs StringBuffer

| Class             | Mutability | Thread Safety              | Speed                     | Use Case                                                                |
| ----------------- | ---------- | -------------------------- | ------------------------- | ----------------------------------------------------------------------- |
| **String**        | Immutable  | Thread-safe                | Slowest                   | When values don’t change much (keys, constants).                        |
| **StringBuilder** | Mutable    | Not Thread-safe            | Fastest                   | Best in **single-threaded** scenarios where strings are modified often. |
| **StringBuffer**  | Mutable    | Thread-safe (synchronized) | Slower than StringBuilder | Use in **multi-threaded** string modification.                          |



 */