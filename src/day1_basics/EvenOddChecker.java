package day1_basics;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is Even.");
        }else{
            System.out.println(num + " is Odd");
        }
        sc.close();
    }
}
