package day11_Exception_Handling;

public class SquareRootCalculator {

    static double calculatorSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        System.out.println("Square root: " + calculatorSquareRoot(25));
        System.out.println("Square root: " + calculatorSquareRoot(-9));
    }
}
