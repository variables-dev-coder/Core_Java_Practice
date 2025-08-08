package revision;

import java.util.Scanner;

public class BasicsRevision {

    public static void main(String[] args) {

        // VARIABLES & DATA TYPES
        int age = 25;                 // int variable
        String name = "Munna";        // String variable
        double salary = 50000.75;     // double variable
        boolean isJavaFun = true;     // boolean variable

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Java Fun? " + isJavaFun);

        // OPERATORS
        int a = 10, b = 3;
        System.out.println("\nArithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));

        // Logical
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b && b > 0) = " + (a > b && b > 0));
        System.out.println("(a < b || b > 0) = " + (a < b || b > 0));

        // Ternary
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("\nTernary Result for a: " + result);

        // LOOPS
        System.out.println("\nFor loop (0 to 4):");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile loop (0 to 4):");
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nDo-While loop (0 to 4):");
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 5);

        System.out.println("\n\nFor-each loop:");
        int[] nums = {10, 20, 30};
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // CONDITIONALS + USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter a number: ");
        int number = sc.nextInt();

        // if-else
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Loop to print numbers from 1 to entered number
        System.out.println("Numbers from 1 to " + number + ":");
        for (int k = 1; k <= number; k++) {
            System.out.print(k + " ");
        }

        // switch
        System.out.print("\n\nEnter day number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }

        sc.close();
    }

}

/*

Name: Munna
Age: 25
Salary: 50000.75
Is Java Fun? true

Arithmetic Operators:
a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1

Relational Operators:
a > b = true
a == b = false

Logical Operators:
(a > b && b > 0) = true
(a < b || b > 0) = true

Ternary Result for a: Even

For loop (0 to 4):
0 1 2 3 4

While loop (0 to 4):
0 1 2 3 4

Do-While loop (0 to 4):
0 1 2 3 4

For-each loop:
10 20 30

Enter a number: 6
Even
Numbers from 1 to 6:
1 2 3 4 5 6

Enter day number (1-7): 5
Friday


 */