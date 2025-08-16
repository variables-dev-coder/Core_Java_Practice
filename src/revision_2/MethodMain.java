package revision_2;

/*

3.2 Methods
1. Method Definition

A method is a block of code that performs a specific task.
Syntax:
returnType methodName(parameters) {
    // method body
}

2. Method Parameters & Return Types

Parameters: Input values passed to the method.
Return Type: What the method gives back (e.g., int, String, void).

Example:

 */

class Calculator {
    // Method without return type
    void greet() {
        System.out.println("Welcome to Calculator!");
    }

    // Method with parameters & return type
    int add(int a, int b) {
        return a + b;
    }
}

public class MethodMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.greet();   // No return value

        int sum = calc.add(10, 20); // Pass values, get return value
        System.out.println("Sum = " + sum);
    }
}

/*
Welcome to Calculator!
Sum = 30

 */