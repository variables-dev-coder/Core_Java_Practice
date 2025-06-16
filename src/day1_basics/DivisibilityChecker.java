package day1_basics;

// Check if number is divisible by 2, 5 or both

import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0 && num % 5 == 0)
            System.out.println(num + " is divisible by both 2 and 5");
        else if (num % 2 == 0)
            System.out.println(num + " is divisible by 2");
        else if (num % 5 == 0)
            System.out.println(num + " is divisible by 5");
        else
            System.out.println(num + " is not divisible by 2 and 5");

        sc.close();

    }
}
