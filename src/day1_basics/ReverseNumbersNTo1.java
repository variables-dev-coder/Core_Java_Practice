package day1_basics;

// Print numbers from N to 1

import java.util.Scanner;

public class ReverseNumbersNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--){
            System.out.println(i + " ");
        }
        sc.close();
    }
}
