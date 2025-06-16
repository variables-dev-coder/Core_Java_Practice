package day1_basics;

// Sum of first N natural numbers

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++){
            sum += i;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
