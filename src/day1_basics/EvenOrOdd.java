package day1_basics;

// Check whether a number is even or odd

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");
    }
}
