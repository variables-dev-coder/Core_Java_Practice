package revisaion_Core_Oop;

public class TypeCastingExample {

    public static void main(String[] args) {
        // Widening Casting (automatic)
        int intNum = 10;
        double doubleNum = intNum;
        System.out.println("Widening: int to double = " + doubleNum);

        // Narrowing Casting (manual)
        double decimalNum = 9.78;
        int wholeNum = (int) decimalNum;
        System.out.println("Narrowing: double to int = " + wholeNum);
    }
}

// Widening: int to double = 10.0
//Narrowing: double to int = 9



/*

1. Widening Casting (Implicit)
Smaller type → Larger type
Done automatically by Java (no data loss)
Example: int → long → float → double

int num = 100;
double bigNum = num; // Implicit casting


2. Narrowing Casting (Explicit)
Larger type → Smaller type
Done manually (possible data loss)
Syntax: (type) value

double pi = 3.14159;
int intPi = (int) pi; // Explicit casting

 */

/*

Interview Questions
What is the difference between widening and narrowing casting?
Why is narrowing casting not automatic?
Will (int) 9.99 give 10 or 9? Why?
Can you cast between non-compatible types like String to int directly? (No, needs parsing)
 */


