package day1_basics;


// Print numbers 1 to N but skip numbers divisible by 3

import java.util.Scanner;

public class SkipDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        System.out.println("Numbers from 1 to " + N + " (Excluding multiples of 3):");

        for (int i = 1; i <= N; i++){
            if (i % 3 == 0){
                continue; // skip the number if divisible by 3
            }
            System.out.print(i + " ");
        }
        sc.close();
    }
}
