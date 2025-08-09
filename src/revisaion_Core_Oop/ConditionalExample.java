package revisaion_Core_Oop;

import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your score: ");
    int score = sc.nextInt();

        if(score >=90)

    {
        System.out.println("Excellent!");
    } else if(score >=75)

    {
        System.out.println("Good!");
    } else if(score >=50)

    {
        System.out.println("Pass");
    } else

    {
        System.out.println("Fail");
    }

        sc.close();
    }
}


/*

Conditional Statements in Java
Concept
Conditional statements allow a program to make decisions based on certain conditions

1. if Statement
Executes a block if the condition is true.

int age = 20;
if (age >= 18) {
    System.out.println("You are an adult.");
}

2. if-else Statement
Executes one block if the condition is true, another if false.

int age = 16;
if (age >= 18) {
    System.out.println("You can vote.");
} else {
    System.out.println("You cannot vote.");
}

3. if-else-if Ladder
Checks multiple conditions in sequence.

int marks = 85;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}


4. Nested if
An if statement inside another if.

int age = 25;
boolean hasLicense = true;
if (age >= 18) {
    if (hasLicense) {
        System.out.println("You can drive.");
    } else {
        System.out.println("You need a license.");
    }
}

5. switch Statement
Checks a variable against multiple possible values.

int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}


Interview Questions
Difference between if-else and switch?
Can switch work with String in Java? (Yes, from Java 7 onwards)
What happens if you forget break in a switch case? (Fall-through)
Which is faster — if-else or switch? (Depends on compiler optimization and case count)

 */