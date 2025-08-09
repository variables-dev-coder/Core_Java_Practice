package revisaion_Core_Oop;

import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Displaying output
        System.out.println("\n--- Personal Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Salary: %.2f", salary);

        sc.close();
    }
}

/*
Enter your name: Munna
Enter your age: 25
Enter your salary: 34000
--- Personal Details ---
Name: Munna
Age: 25
Salary: 34000.00

 */


/*
Input / Output in Java
Concept
Java provides different ways to take input from the user and display output.


System.out.print() → prints without a newline
System.out.println() → prints with a newline
System.out.printf() → prints with formatting


System.out.print("Hello ");
System.out.println("Munna");
System.out.printf("Salary: %.2f", 34000.0);


import the scanner class
import java.util.Scanner;


create scanner object
Scanner sc = new Scanner(System.in);


Use methods to read different data types:
String name = sc.nextLine();  // reads a line of text
int age = sc.nextInt();       // reads an integer
double salary = sc.nextDouble(); // reads a decimal number


Close the scanner:
sc.close();

 */

/*

Interview Questions
Difference between next() and nextLine() in Scanner?
Why should we close the Scanner object?
Can we take character input directly in Java? (Yes, by sc.next().charAt(0))
What is the default output stream in Java? (System.out)

 */