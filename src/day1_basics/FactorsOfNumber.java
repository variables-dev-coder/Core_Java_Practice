package day1_basics;

// Print all factors of a number

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Factors: ");
        for (int i = 1; i <= num; i++){
            if (num %i == 0){
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}
