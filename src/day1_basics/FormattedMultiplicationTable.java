package day1_basics;

import java.util.Scanner;

public class FormattedMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
        sc.close();
    }
}
