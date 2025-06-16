package day1_basics;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking User Input
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Logic using if-else
        if (age >= 18){
            System.out.println("Hi " +name + ", You are an Adult.");
        }else{
            System.out.println("Hi " + name + ", You are a Minor!, Try next Year");
        }
        sc.close();
    }
}
