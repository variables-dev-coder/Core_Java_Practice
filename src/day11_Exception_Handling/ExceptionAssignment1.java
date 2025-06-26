package day11_Exception_Handling;

import java.util.Scanner;

public class ExceptionAssignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter numerator: ");
            int a = sc.nextInt();

            System.out.println("Enter denominator: ");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divided by zero!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter number only.");
        } finally {
            System.out.println("Closing scanner.");
            sc.nextInt();
        }

    }
}
