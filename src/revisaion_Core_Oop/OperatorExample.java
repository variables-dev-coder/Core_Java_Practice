package revisaion_Core_Oop;

public class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
    }
}

/*
o/p
a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1
a > b: true
a == b: false
x && y: false
x || y: true
!x: false
a & b = 2
a | b = 11
 */

/*
1. Arithmetic Operators
Used for mathematical calculations:
+ addition
- subtraction
* multiplication
/ division
% modulus (remainder)


int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1


2. Relational (Comparison) Operators
Return boolean values:
== equal
!= not equal
> greater
< less
>= greater or equal
<= less or equal

System.out.println(a > b);  // true
System.out.println(a == b); // false


3. Logical Operators
Used for combining conditions:
&& logical AND
|| logical OR
! logical NOT

boolean x = true, y = false;
System.out.println(x && y); // false
System.out.println(x || y); // true
System.out.println(!x);     // false


4. Assignment Operators
Assign values:
=, +=, -=, *=, /=, %=

int num = 5;
num += 3; // num = num + 3 → 8


5. Unary Operators
++ increment
-- decrement
+ unary plus
- unary minus

int c = 5;
System.out.println(++c); // 6 (pre-increment)
System.out.println(c++); // 6 (post-increment, c becomes 7)


6. Bitwise Operators
Operate on bits:
& AND
| OR
^ XOR
~ NOT
<< left shift
>> right shift

int p = 5, q = 3;
System.out.println(p & q); // 1
System.out.println(p | q); // 7
System.out.println(p ^ q); // 6
System.out.println(p << 1); // 10
System.out.println(p >> 1); // 2



Interview Questions
Difference between && and & in Java?
What is the difference between == and .equals()?
Difference between pre-increment and post-increment?
What is the difference between >> and >>>?
 */