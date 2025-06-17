package day1_basics;

// Sum of digits

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
