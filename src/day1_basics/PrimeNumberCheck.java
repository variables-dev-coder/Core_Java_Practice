package day1_basics;

// Check if a number is prime

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <= 1) isPrime = false;
        else {
            for(int i = 2; i<= num / 2; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
