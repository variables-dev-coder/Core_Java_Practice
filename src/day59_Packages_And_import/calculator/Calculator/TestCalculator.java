package day59_Packages_And_import.calculator.Calculator;

import day59_Packages_And_import.calculator.Calculatorr;

public class TestCalculator {
    public static void main(String[] args) {
        Calculatorr calc = new Calculatorr();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
    }
}

//Add: 15
//Subtract: 5
//Multiply: 50
//Divide: 2.0