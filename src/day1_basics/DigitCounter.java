package day1_basics;

// Count number of digits

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit Here: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0){
            num /= 10;
            count++;
        }
        System.out.println("Total Digits = " + count);
        sc.close();
    }
}
