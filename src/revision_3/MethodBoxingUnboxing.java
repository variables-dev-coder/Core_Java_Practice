package revision_3;

public class MethodBoxingUnboxing {
    // Method accepting wrapper class
    public static void printSquare(Integer num) {
        // Unboxing happens automatically here
        int square = num * num;
        System.out.println("Square of " + num + " is: " + square);
    }

    // Method returning wrapper
    public static Integer addNumbers(int a, int b) {
        // Autoboxing happens while returning
        return a + b;
    }

    public static void main(String[] args) {
        int x = 7;

        // Autoboxing while calling method (int → Integer)
        printSquare(x);

        // Passing primitives, but method returns Integer
        Integer result = addNumbers(10, 20);

        // Unboxing result into primitive
        int value = result;
        System.out.println("Sum: " + value);
    }
}

/*
Explanation:

printSquare(x) → int x gets autoboxed into Integer. Inside method, num * num → Integer is unboxed into int.
addNumbers(10, 20) → returns Integer (autoboxing). Assigned to int value, so unboxing happens.

 */