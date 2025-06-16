package day1_basics;

// Find smallest of 3 numbers using if-else

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min;

        if ( a <= b && a <= c)
            min = a;
        else if (b <= c)
            min = b;
        else
            min = c;

        System.out.println("Smallest number is: " + min);
        sc.close();
    }
}
