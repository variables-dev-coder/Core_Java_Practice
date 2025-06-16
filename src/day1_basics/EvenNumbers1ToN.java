package day1_basics;

import java.util.Scanner;

public class EvenNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Enter numbers from 1 to " + N + ":");

        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
