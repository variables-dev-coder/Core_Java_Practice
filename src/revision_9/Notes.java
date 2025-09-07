package revision_9;

public class Notes {
    public static void main(String[] args) {


        /*

Exception Handling in Java
--------------------------

What is Exception Handling?
---------------------------
    Exception → an unwanted event that disrupts program flow (like dividing by zero, file not found, null reference).
    Exception Handling → mechanism to handle runtime errors gracefully without crashing the program.

Hierarchy:
    Throwable
   ├── Error (serious issues, not handled usually)
   └── Exception
         ├── Checked (IOException, SQLException…)
         └── Unchecked (RuntimeException: NullPointerException, ArithmeticException…)


------------------------------



1. try-catch-finally
--------------------
    try: Block of code that may throw exception.
    catch: Handle the exception.
    finally: Executes always, whether exception occurs or not (used for closing resources).

Example:

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}


Output:

Error: Division by zero
Finally block executed




---------------------------------------



2. Multiple catch blocks
------------------------
    You can catch multiple exception types separately.
    More specific exceptions should come before general exceptions.

Example:

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBounds
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}

Output:

Array index out of bounds


--------------------------------------


3. throw & throws
------------------
    throw: Used to explicitly throw an exception.
    throws: Declares exceptions a method might throw.

Example:

public class ThrowThrowsDemo {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18+");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

Output:

Exception caught: Age must be 18+


---------------------------------------


4. Custom Exceptions
--------------------
    You can create your own exception class by extending Exception or RuntimeException.

Example:

// Custom exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance);
        }
        System.out.println("Withdrawal successful: " + amount);
    }

    public static void main(String[] args) {
        try {
            withdraw(5000, 7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

Output:

Error: Insufficient balance! Available: 5000.0


------------------------------------------------



Key Interview Points
--------------------
1.Checked vs Unchecked Exceptions
    Checked → must be handled (IOException).
    Unchecked → runtime exceptions (NullPointerException).

2.Difference between throw and throws
    throw → used to throw an exception object.
    throws → declares exceptions in method signature.

3.finally vs finalize
    finally → block always executed.
    finalize() → method called by GC before object deletion.

4.Can finally block be skipped?
    Yes → if System.exit(0) is called in try/catch.


         */
    }
}
