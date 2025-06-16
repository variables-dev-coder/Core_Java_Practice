package day1_basics;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking User Input
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();

        // Logic
        if ( a >= b && a > c){
            System.out.println("Largest Number is: " + a);
        }else if (b >= c ){
            System.out.println("Largest Number is: " +b);
        }else{
            System.out.println("Largest Number is: c");
        }
        sc.close();
    }
}
