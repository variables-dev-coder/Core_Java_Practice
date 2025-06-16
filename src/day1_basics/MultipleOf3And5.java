package day1_basics;

// Check if number divisible by both 3 and 5

import java.util.Scanner;

public class MultipleOf3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println(num + " is divisible by both 3 and 5");
        else
            System.out.println(num + " Is not divisible by both 3 and 5");

        sc.close();
    }
}
