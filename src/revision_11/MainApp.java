package revision_11;


/*
I. Foundational Syntax & Structure
    1. The main Method & Basic Program Structure
        Every standalone Java app starts execution from public static void main(String[] args).

Example:
 */

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello, Darling");
    }
}

/*
Hello, Darling


2. Variables: Declaration, Initialization, Scoping
---------------------------------------------------
    Declaration: int x;
    Initialization: x = 10;
    Declaration + Initialization: int x = 10;
    Scope: Variable only exists within its block { }.


3. Primitive Data Types
-----------------------
    byte (8-bit), short (16-bit), int (32-bit), long (64-bit)
    float (32-bit, decimal), double (64-bit, precise decimal)
    char (16-bit Unicode)
    boolean (true/false)


4. Reference Types vs. Primitive Types
--------------------------------------
Primitive: store actual values (int x = 5;)
Reference: store addresses of objects (String s = "Hello";)


5. Operators
-------------
    Arithmetic: + - * / %
    Unary: + - ++ -- !
    Assignment: = += -= *= /= %=
    Relational: < > <= >= == !=
    Logical: && || !
    Bitwise: & | ^ ~ << >> >>>
    Ternary: condition ? value1 : value2


6. Control Flow Statements
--------------------------

6.1. Conditional
----------------
if (x > 0) { }
else if (x == 0) { }
else { }

switch (day) {
    case 1, 2, 3 -> System.out.println("Weekday");
    case 6, 7 -> System.out.println("Weekend");
    default -> System.out.println("Invalid day");
}


6.2. Looping
------------
for (int i = 0; i < 5; i++) { }       // classic for
for (int n : numbers) { }             // enhanced for-loop
while (x > 0) { }                     // while loop
do { } while (x > 0);                 // do-while loop


6.3. Branching
---------------
for (int i = 0; i < 5; i++) {
    if (i == 2) continue; // skip iteration
    if (i == 4) break;    // exit loop
}
return; // exits method



 */