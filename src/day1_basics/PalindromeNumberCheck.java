package day1_basics;

// Check Palindrome number

import java.util.Scanner;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;

        while (num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original == rev ? "Palindrom" : "Not Palindrom");
        sc.close();
    }
}
