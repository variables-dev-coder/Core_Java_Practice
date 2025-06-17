package day1_basics;

// Armstrong number

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (num != 0){
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        System.out.println(original == sum ? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}
