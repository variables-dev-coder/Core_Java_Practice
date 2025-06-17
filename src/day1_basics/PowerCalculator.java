package day1_basics;

// Power of a Number

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int base = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++){
            result *= base;
        }
        System.out.println(base + "^" + power + " = " + result);
    }
}
