package day1_basics;

// LCM of two numbers

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM = " + lcm);
        sc.close();

    }
    private static int gcd(int x, int y){
        while (y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
