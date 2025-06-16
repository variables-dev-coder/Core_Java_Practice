package day1_basics;

// Print all odd numbers from 1 to N

import java.util.Scanner;

public class OddNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}
